package com.nci.smartclassroom.smartclassroomsystem;

import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;

public class SmartResourceImpl extends SmartResourceServiceGrpc.SmartResourceServiceImplBase {

    @Override
    public void checkResourceAvailability(ResourceCheckRequest request, StreamObserver<ResourceCheckResponse> responseObserver) {
        ResourceCheckResponse response = ResourceCheckResponse.newBuilder()
                .setAvailable(true)
                .setQuantity(3)
                .setLocation("Library Floor 2")
                .setEstimatedWaitTime("0 mins")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ResourceRequest> requestResources(StreamObserver<ResourceSummaryResponse> responseObserver) {
        return new StreamObserver<ResourceRequest>() {
            private int count = 0;
            private final List<String> itemList = new ArrayList<>();

            @Override
            public void onNext(ResourceRequest request) {
                count++;
                itemList.add(request.getResourceName());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Resource stream error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                ResourceSummaryResponse summary = ResourceSummaryResponse.newBuilder()
                        .setItemsAvailable(count)
                        .setItemsPending(0)
                        .setMessage("All " + count + " requested resources reserved.")
                        .addAllFulfilledItems(itemList)
                        .build();

                responseObserver.onNext(summary);
                responseObserver.onCompleted();
            }
        };
    }
}