package com.company;

import java.net.*;

public class MulticastSender {
    public static final int PORT = 1200;
    public static MulticastSocket multicastSocket;
    public static DatagramPacket dataPacket;
    public static InetAddress ipAddress;
    public static byte[] data;

    public static void main(String[] args)throws Exception {
        sendMessage("Hi there, this is first multicast Message.");
        sendMessage("Hi there, this is second multicast Message.");
        sendMessage("end");
        sendMessage(" ");

    }

    public static void sendMessage (String message) throws Exception {
        ipAddress = InetAddress.getByName("225.4.5.6");
        multicastSocket = new MulticastSocket();
        Thread.sleep(1000);
        System.out.println("Sending.....");
        data = message.getBytes();
        dataPacket = new DatagramPacket(data,message.length(),ipAddress,PORT);
        multicastSocket.send(dataPacket);

    }
}