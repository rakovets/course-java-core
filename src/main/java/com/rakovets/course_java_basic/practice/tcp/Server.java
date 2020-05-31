package main.java.com.rakovets.course_java_basic.practice.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Server address: " + serverSocket.getInetAddress().getHostAddress());
            System.out.println("Local port: " + serverSocket.getLocalPort());
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread.sleep(100);
                System.out.println("Client connected.\t" + System.nanoTime());
                InputStream inputStream = clientSocket.getInputStream();
                if (inputStream.available() > 0) {
                    byte[] data = new byte[inputStream.available()];
                    inputStream.read(data);
                    System.out.println("Message read.\t\t" + System.nanoTime());
                    String message = new String(data);
                    System.out.println(">" + message);
                }
                System.out.println("Client closed.\t\t" + System.nanoTime());
            }
        } catch (IOException e) {
            System.out.println("Server IOException: " + e);
        } catch (InterruptedException e) {
            System.out.println("Server InterruptedException: " + e);
        }
    }
}
