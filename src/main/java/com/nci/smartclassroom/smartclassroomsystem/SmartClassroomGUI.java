package com.nci.smartclassroom.smartclassroomsystem;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;

public class SmartClassroomGUI extends JFrame {

    private JTextArea displayArea;
    private ManagedChannel channel;

    private StudentEngagementServiceGrpc.StudentEngagementServiceBlockingStub engagementBlockingStub;
    private StudentEngagementServiceGrpc.StudentEngagementServiceStub engagementAsyncStub;
    private SmartResourceServiceGrpc.SmartResourceServiceBlockingStub resourceBlockingStub;
    private SmartResourceServiceGrpc.SmartResourceServiceStub resourceAsyncStub;
    private CollaborationServiceGrpc.CollaborationServiceStub collaborationAsyncStub;

    public SmartClassroomGUI() {
        setTitle("Smart Classroom Control Interface");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Smart Classroom System - SDG 4", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 3, 5, 5));

        JButton btnTrackAttendance = new JButton("Track Attendance");
        JButton btnMonitorEngagement = new JButton("Monitor Engagement");
        JButton btnCheckResource = new JButton("Check Resource");
        JButton btnRequestResources = new JButton("Request Resources");
        JButton btnFindTutor = new JButton("Find Tutor");
        JButton btnStudyGroup = new JButton("Study Group Chat");

        buttonPanel.add(btnTrackAttendance);
        buttonPanel.add(btnMonitorEngagement);
        buttonPanel.add(btnCheckResource);
        buttonPanel.add(btnRequestResources);
        buttonPanel.add(btnFindTutor);
        buttonPanel.add(btnStudyGroup);
        add(buttonPanel, BorderLayout.SOUTH);

        btnTrackAttendance.addActionListener(e -> runTrackAttendance());
        btnMonitorEngagement.addActionListener(e -> runMonitorEngagement());
        btnCheckResource.addActionListener(e -> runCheckResource());
        btnRequestResources.addActionListener(e -> runRequestResources());
        btnFindTutor.addActionListener(e -> runFindTutor());
        btnStudyGroup.addActionListener(e -> runStudyGroup());

        connectWithJmDNS();
    }

    private void connectWithJmDNS() {
        writeLog("Searching for server with jmDNS...");
        new Thread(() -> {
            try {
                JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
                jmdns.addServiceListener("_smartclassroom._tcp.local.", new ServiceListener() {
                    @Override
                    public void serviceAdded(ServiceEvent event) {}

                    @Override
                    public void serviceRemoved(ServiceEvent event) {}

                    @Override
                    public void serviceResolved(ServiceEvent event) {
                        String host = event.getInfo().getHostAddresses()[0];
                        int port = event.getInfo().getPort();

                        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
                        engagementBlockingStub = StudentEngagementServiceGrpc.newBlockingStub(channel);
                        engagementAsyncStub = StudentEngagementServiceGrpc.newStub(channel);
                        resourceBlockingStub = SmartResourceServiceGrpc.newBlockingStub(channel);
                        resourceAsyncStub = SmartResourceServiceGrpc.newStub(channel);
                        collaborationAsyncStub = CollaborationServiceGrpc.newStub(channel);

                        writeLog("Connected to server at " + host + ":" + port);
                    }
                });
            } catch (Exception e) {
                writeLog("Connection error: " + e.getMessage());
            }
        }).start();
    }

    private void runTrackAttendance() {
        if (engagementBlockingStub == null) return;
        AttendanceRequest req = AttendanceRequest.newBuilder()
                .setStudentId("S25192973")
                .setClassId("CS101")
                .setTimestamp("09:00 AM")
                .build();
        AttendanceResponse res = engagementBlockingStub.trackAttendance(req);
        writeLog("[Attendance] " + res.getMessage() + " at " + res.getRecordedTime());
    }

    private void runMonitorEngagement() {
        if (engagementAsyncStub == null) return;
        EngagementRequest req = EngagementRequest.newBuilder().setClassId("CS101").setClassName("Distributed Systems").build();
        writeLog("[Engagement] Starting real-time stream...");
        
        engagementAsyncStub.monitorEngagement(req, new StreamObserver<EngagementResponse>() {
            @Override
            public void onNext(EngagementResponse value) {
                writeLog(" -> Student: " + value.getStudentId() + " | Score: " + value.getAttentionScore() + " | Level: " + value.getEngagementLevel());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                writeLog("[Engagement] Stream finished.");
            }
        });
    }

    private void runCheckResource() {
        if (resourceBlockingStub == null) return;
        ResourceCheckRequest req = ResourceCheckRequest.newBuilder()
                .setResourceName("Textbook")
                .setResourceType("book")
                .setLocation("Library")
                .build();
        ResourceCheckResponse res = resourceBlockingStub.checkResourceAvailability(req);
        writeLog("[Resource Check] Available: " + res.getAvailable() + " | Qty: " + res.getQuantity() + " | Location: " + res.getLocation());
    }

    private void runRequestResources() {
        if (resourceAsyncStub == null) return;
        writeLog("[Request Stream] Sending batch request...");
        
        StreamObserver<ResourceRequest> stream = resourceAsyncStub.requestResources(new StreamObserver<ResourceSummaryResponse>() {
            @Override
            public void onNext(ResourceSummaryResponse summary) {
                writeLog("[Resource Summary] " + summary.getMessage());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                writeLog("[Request Stream] Completed.");
            }
        });

        stream.onNext(ResourceRequest.newBuilder().setResourceId("R1").setResourceName("Laptop").setQuantity(1).setPriority("high").setRequesterId("S25192973").build());
        stream.onNext(ResourceRequest.newBuilder().setResourceId("R2").setResourceName("Lab Kit").setQuantity(2).setPriority("medium").setRequesterId("S25192973").build());
        stream.onCompleted();
    }

    private void runFindTutor() {
        if (collaborationAsyncStub == null) return;
        TutorRequest req = TutorRequest.newBuilder().setSubject("Computer Science").setTopic("gRPC").setStudentId("S25192973").build();
        writeLog("[Tutor Stream] Finding available tutors...");

        collaborationAsyncStub.findTutor(req, new StreamObserver<TutorResponse>() {
            @Override
            public void onNext(TutorResponse tutor) {
                writeLog(" -> Tutor Found: " + tutor.getName() + " (" + tutor.getExpertise() + ") - Rating: " + tutor.getRating());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                writeLog("[Tutor Stream] Search completed.");
            }
        });
    }

    private void runStudyGroup() {
        if (collaborationAsyncStub == null) return;
        writeLog("[Study Group] Connecting to group chat...");

        StreamObserver<GroupMessage> stream = collaborationAsyncStub.coordinateStudyGroup(new StreamObserver<GroupUpdate>() {
            @Override
            public void onNext(GroupUpdate update) {
                writeLog("[Group Chat] " + update.getSender() + ": " + update.getMessage());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                writeLog("[Study Group] Chat session ended.");
            }
        });

        stream.onNext(GroupMessage.newBuilder().setStudentId("S25192973").setGroupId("CS101-GRP1").setMessageType("join").setContent("Hello everyone").build());
        stream.onNext(GroupMessage.newBuilder().setStudentId("S25192973").setGroupId("CS101-GRP1").setMessageType("message").setContent("Ready for study session").build());
        stream.onCompleted();
    }

    private void writeLog(String text) {
        SwingUtilities.invokeLater(() -> displayArea.append(text + "\n"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SmartClassroomGUI().setVisible(true));
    }
}