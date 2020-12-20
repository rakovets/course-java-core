package com.rakovets.course.javabasics.example.networking.tcp.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Connection extends Thread {
    private static final short KILOBYTE = 1024;
    private final Socket socket;

    public Connection(Socket socket) {
        this.socket = socket;
        setPriority(NORM_PRIORITY);
        start();
    }

    public void run() {
        try {
            System.out.println("Connection opened.");
            InputStream inputStream = socket.getInputStream(); // получение InputStream для чтения данных из Socket клиента
            OutputStream os = socket.getOutputStream(); // получение OutputStream для записи данных в Socket клиента

            byte buffer[] = new byte[64 * KILOBYTE]; // буффер данных размерностью в 64 килобайта
            int length = inputStream.read(buffer); // чтение данных и размерность прочитанных данных (< 64Kb)
            String data = new String(buffer, 0, length); // преобразование прочитанных данных в строку
            System.out.println(">" + data);
            os.write(data.getBytes()); // запись данных
            socket.close(); // закрываем соединение
            System.out.println("Connection closed.");
        } catch (IOException e) {
            System.out.println("Connection IOException: " + e);
        }
    }
}
