package com.rakovets.course.javabasics.example.networking.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    private static final int SERVER_PORT = 8080;
    private static final short KILOBYTE = 1024;

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(SERVER_PORT);
            System.out.println("Server started.");

            byte buffer[] = new byte[KILOBYTE]; // буффер данных размерностью в 1 килобайт
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            while (true) {
                datagramSocket.receive(packet);
                System.out.printf("Received from %s. Length: %d\n", packet.getSocketAddress(), packet.getLength());
                System.out.println(">" + new String(packet.getData()));
                buffer = new byte[KILOBYTE];
                packet.setData(buffer);
            }
        } catch (IOException e) {
            System.out.println("Server IOException: " + e);
        }
    }
}
