package main.java.com.rakovets.course_java_basic.practice.tcp.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FiliesUtils {

    public void sendFilies() throws IOException {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8080);
        } catch (IOException ex) {
            System.out.println("Can't setup server on this port number. ");
        }

        Socket socket = null;
        InputStream in = null;
        OutputStream out = null;

        try {
            socket = serverSocket.accept();
        } catch (IOException ex) {
            System.out.println("Can't accept client connection. ");
        }

        try {
            in = socket.getInputStream();
        } catch (IOException ex) {
            System.out.println("Can't get socket input stream. ");
        }

        try {
            out = new FileOutputStream("D:\\dev2\\java-practice\\src\\main\\java\\com\\rakovets\\course_java_basic\\practice\\tcp\\task08-copy.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. ");
        }

        byte[] bytes = new byte[16 * 1024];

        int count;
        while ((count = in.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }

        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }

    public void showAllFilesPath(){

    }
}
