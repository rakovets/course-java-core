package main.java.com.rakovets.course_java_basic.practice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 1090;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                menu();
                String answerOfClient = scanner.nextLine();
                Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
                System.out.println("Client connected");
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(answerOfClient.getBytes());
                System.out.println("Message write");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void menu() {
        System.out.println("Choose action please:\n" +
                "1. get list of files that exist on server\n" +
                "2. get file from server by path\n" +
                "3. create file on server by path\n" +
                "4. delete file on server by path\n");
    }

    public static void menuForIndicatePortAndHost() {
        System.out.println("Write port:");
        Scanner scanner = new Scanner(System.in);
        String port = scanner.nextLine();
        System.out.println("Write host:");
        int host = scanner.nextInt();
    }
}
