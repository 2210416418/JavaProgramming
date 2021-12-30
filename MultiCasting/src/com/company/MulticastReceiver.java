package com.company;

import java.net.*;

public class MulticastReceiver {
    public static final int port = 1200;
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        String groupIPAddress = "225.4.5.6";

        receiveMessage(groupIPAddress);

    }

    public static void receiveMessage(String groupIPAddress) throws Exception{
        MulticastSocket multicastSocket;
        DatagramPacket dataPacket;
        InetAddress ipAddress;

        ipAddress = InetAddress.getByName(groupIPAddress);
        multicastSocket = new MulticastSocket(MulticastReceiver.port);
        multicastSocket.joinGroup(ipAddress);

        byte[] data = new byte[1024];
        dataPacket = new DatagramPacket(data,data.length);
        System.out.println("Waiting to receive......");

//        multicastSocket.receive(dataPacket);
//        System.out.println("Received from IP address of multicast group : "
//                + dataPacket.getAddress());
//        System.out.println("Port number : " + dataPacket.getPort());
//        System.out.println("Message received : " + new String(dataPacket.getData(), 0,
//                dataPacket.getLength()) + "\nLength of message sent : " + dataPacket.getLength());

        while (true) {
            multicastSocket.receive(dataPacket);
            System.out.println("Received from IP address of multicast group : "
                    + dataPacket.getAddress());
            System.out.println("Port number : " + dataPacket.getPort());
            System.out.println("Message received : " + new String(dataPacket.getData(), 0,
                    dataPacket.getLength()) + "\nLength of message sent : " + dataPacket.getLength());
            if (" ".equals(new String(dataPacket.getData(), 0, dataPacket.getLength()))) break;
        }
        multicastSocket.leaveGroup(ipAddress);
        System.out.println("\nLeaving the group and closing the socket");
        multicastSocket.close();
        System.exit(0);

    }
}