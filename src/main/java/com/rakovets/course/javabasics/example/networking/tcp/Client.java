package com.rakovets.course.javabasics.example.networking.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("<");
                String message = scanner.nextLine();
                Socket socket = new Socket(SERVER_HOST, SERVER_PORT); // соединяемся сокету на сервере
                System.out.println("Client connected.\t" + System.nanoTime());
                OutputStream os = socket.getOutputStream(); // получение OutputStream для записи данных в Socket
                os.write(message.getBytes()); // записываем в OutputStream сообщение
                System.out.println("Message wrote.\t\t" + System.nanoTime());
            }
        } catch (IOException e) {
            System.out.println("Client IOException: " + e);
        }
    }
}
