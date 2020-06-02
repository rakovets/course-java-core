package main.java.com.rakovets.course_java_basic.practice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 1090;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static Socket clientSocket;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        try {
            while (true) {
                clientSocket = new Socket(SERVER_HOST, SERVER_PORT);
                System.out.println("Client connected");
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                System.out.println("Enter message for SERVER:");
                String word = scanner.nextLine();
                out.write(word + "\n");
                out.flush();
                String serverWord = in.readLine();
                System.out.println("Answer from Server - " + serverWord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void menu() {
        System.out.println("Choose action please:\n" +
                "`LIST` - вернуть список доступных файлов\n" +
                "`GET` - вернуть файл\n" +
                "`SEND` - создать файл клиента\n" +
                "`DELETE` - удалить файл на сервере\n");
    }
}
