package com.rakovets.course.javabasics.example.networking.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Server address: " + serverSocket.getInetAddress().getHostAddress());
            System.out.println("Local Port: " + serverSocket.getLocalPort());

            while (true) {
                Socket socket = serverSocket.accept(); // приостонавливает поток, пока не установится соединение с клиетом
                Thread.sleep(1); // остонавливаемся для того что клиент отправил данные
                System.out.println("Client connected.\t" + System.nanoTime());
                InputStream inputStream = socket.getInputStream(); // получение InputStream для чтения данных из Socket
                if (inputStream.available() > 0) { // проверка наличия байт в потоке
                    byte[] data = new byte[inputStream.available()];
                    inputStream.read(data);
                    System.out.println("Message read.\t\t" + System.nanoTime());
                    String message = new String(data);
                    System.out.println(">" + message);
                }
            }
        } catch (IOException e) {
            System.out.println("Server IOException: " + e);
        } catch (InterruptedException e) {
            System.out.println("Server InterruptedException: " + e);
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                System.out.println("Server finally IOException: " + e);
            }
        }
    }
}
