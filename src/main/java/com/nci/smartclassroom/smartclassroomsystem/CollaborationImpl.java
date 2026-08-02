package com.nci.smartclassroom.smartclassroomsystem;

import io.grpc.stub.StreamObserver;
import java.time.LocalTime;

public class CollaborationImpl extends CollaborationServiceGrpc.CollaborationServiceImplBase {

    @Override
    public void findTutor(TutorRequest request, StreamObserver<TutorResponse> responseObserver) {
        TutorResponse t1 = TutorResponse.newBuilder()
                .setTutorId("T101")
                .setName("Dr. Smith")
                .setExpertise(request.getSubject() + " Expert")
                .setRating(4.8)
                .setSessionsCompleted(35)
                .setAvailable(true)
                .setContactInfo("drsmith@nci.ie")
                .build();

        TutorResponse t2 = TutorResponse.newBuilder()
                .setTutorId("T102")
                .setName("Jane Doe")
                .setExpertise("Peer Tutor")
                .setRating(4.5)
                .setSessionsCompleted(12)
                .setAvailable(true)
                .setContactInfo("janedoe@student.nci.ie")
                .build();

        responseObserver.onNext(t1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        responseObserver.onNext(t2);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<GroupMessage> coordinateStudyGroup(StreamObserver<GroupUpdate> responseObserver) {
        return new StreamObserver<GroupMessage>() {
            @Override
            public void onNext(GroupMessage msg) {
                GroupUpdate update = GroupUpdate.newBuilder()
                        .setGroupId(msg.getGroupId())
                        .setUpdateType(msg.getMessageType())
                        .setSender(msg.getStudentId())
                        .setMessage("Update: " + msg.getContent())
                        .setTimestamp(LocalTime.now().toString())
                        .build();

                responseObserver.onNext(update);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Group stream error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}