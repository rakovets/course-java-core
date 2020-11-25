package com.rakovets.course.javabasics.example.networking.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8080;
    private static final short KILOBYTE = 1024;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            InetAddress address = InetAddress.getLocalHost();
            DatagramSocket socket = new DatagramSocket();
            byte buffer[] = new byte[KILOBYTE]; // буффер данных размерностью в 1 килобайт
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(SERVER_HOST), SERVER_PORT);
            while (true) {
                System.out.print("<");
                byte[] message = scanner.nextLine().getBytes();
                packet.setData(message);
                socket.send(packet);
                System.out.printf("Sent to %s. Length: %d\n", packet.getSocketAddress(), packet.getLength());
            }
        } catch (IOException e) {
            System.out.println("Server IOException: " + e);
        }
    }
}
