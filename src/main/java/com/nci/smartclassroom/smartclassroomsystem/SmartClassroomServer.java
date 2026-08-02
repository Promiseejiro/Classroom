package com.nci.smartclassroom.smartclassroomsystem;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class SmartClassroomServer {

    private Server server;
    private JmDNS jmdns;

    public void startServer() throws IOException {
        int port = 50051;
        
        server = ServerBuilder.forPort(port)
                .addService(new StudentEngagementImpl())
                .addService(new SmartResourceImpl())
                .addService(new CollaborationImpl())
                .build()
                .start();

        System.out.println("Server running on port " + port);

        jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo info = ServiceInfo.create("_smartclassroom._tcp.local.", "SmartClassroomServer", port, "Smart Classroom Services");
        jmdns.registerService(info);
        System.out.println("Service registered via jmDNS");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        SmartClassroomServer serverInstance = new SmartClassroomServer();
        serverInstance.startServer();
        serverInstance.server.awaitTermination();
    }
}