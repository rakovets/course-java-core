package com.rakovets.course.javabasics.example.networking.tcp;

import com.rakovets.course.javabasics.example.networking.tcp.model.Connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class MultiServer {
    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("MultiServer started.");
            while (true) {
                new Connection(serverSocket.accept());
            }
        } catch (UnknownHostException e) {
            System.out.println("MultiServer UnknownHostException: " + e);
        } catch (IOException e) {
            System.out.println("MultiServer IOException: " + e);
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                    System.out.println("MultiServer finished.");
                }
            } catch (IOException e) {
                System.out.println("MultiServer finally IOException: " + e);
            }
        }
    }
}
