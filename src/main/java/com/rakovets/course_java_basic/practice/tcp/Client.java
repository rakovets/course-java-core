package main.java.com.rakovets.course_java_basic.practice.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("<");
                String message = scanner.nextLine();
                Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
                System.out.println("Client connected.\t\t\t" + System.nanoTime());
                OutputStream os = socket.getOutputStream();
                os.write(message.getBytes());
                System.out.println("Message wrote.\t\t\t\t" + System.nanoTime());
                socket.close();
                System.out.println("Client connection closed.\t" + System.nanoTime());
            }
        } catch (IOException e) {
            System.out.println("Client IOException: " + e);
        }
    }
}
