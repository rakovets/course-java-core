package main.java.com.rakovets.course_java_basic.practice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 9090;

    public static void main(String[] args) {

        try {
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            System.out.println("Client connected");
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello".getBytes());
            System.out.println("Message write");
            socket.close();
            System.out.println("Client connection closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void menu() {
        System.out.println("Choose action please:\n" +
                "1. get list of files that exist on server" +
                "2. get file from server by path" +
                "3. create file on server by path" +
                "4. delete file on server by path");
    }
}
