package com.nci.smartclassroom.smartclassroomsystem;

import io.grpc.stub.StreamObserver;
import java.time.LocalTime;

public class StudentEngagementImpl extends StudentEngagementServiceGrpc.StudentEngagementServiceImplBase {

    @Override
    public void trackAttendance(AttendanceRequest request, StreamObserver<AttendanceResponse> responseObserver) {
        AttendanceResponse response = AttendanceResponse.newBuilder()
                .setPresent(true)
                .setMessage("Attendance recorded for student " + request.getStudentId())
                .setRecordedTime(LocalTime.now().toString())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorEngagement(EngagementRequest request, StreamObserver<EngagementResponse> responseObserver) {
        String[] students = {"S12345", "S67890", "S251927"};
        double[] scores = {0.85, 0.40, 0.95};
        int[] counts = {5, 1, 8};
        int[] levels = {3, 1, 3};

        for (int i = 0; i < students.length; i++) {
            EngagementResponse response = EngagementResponse.newBuilder()
                    .setStudentId(students[i])
                    .setAttentionScore(scores[i])
                    .setParticipationCount(counts[i])
                    .setEngagementLevel(levels[i])
                    .setTimestamp(LocalTime.now().toString())
                    .build();

            responseObserver.onNext(response);
            
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        responseObserver.onCompleted();
    }
}