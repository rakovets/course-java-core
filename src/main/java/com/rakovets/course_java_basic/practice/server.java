package main.java.com.rakovets.course_java_basic.practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class server {

    public static final int PORT = 1090;

    public static void main(String[] args) {
        String path = "C:\\Users\\user\\Desktop\\dev\\java-practice\\src\\main\\java\\com\\rakovets" +
                "\\course_java_basic\\practice\\files";

        String pathToFile = "C:\\Users\\user\\Desktop\\dev\\java-practice\\src\\main\\java\\com\\rakovets" +
                "\\course_java_basic\\practice\\files\\text.txt";

        File file = new File(path);

        ServerSocket serverSocket = null;

            try {
                serverSocket = new ServerSocket(PORT);
                System.out.println("Server address:" + serverSocket.getInetAddress().getHostAddress());
                System.out.println("Server port:" + serverSocket.getLocalPort());
                System.out.println("SERVER START");

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    Thread.sleep(100);
                    System.out.println("Client connected");
                    InputStream inputStream = clientSocket.getInputStream();

                    if (inputStream.available() > 0) {
                        byte[] data = new byte[inputStream.available()];
                        inputStream.read(data);
                        System.out.println("Message read");
                        String message = new String(data);
                        System.out.println("Message on server:" + message);
                    }
                }

            } catch (IOException e) {
                System.out.println("Server exception:" + e);
            } catch (InterruptedException e) {
                e.printStackTrace();
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


//        System.out.println(getFileByPath(pathToFile));

//        createFileOnServer(path, "text2.txt");

//        deleteFileOnServer(path, "text2.txt");


    public static List<String> getListOfFiles(File file) {
        List<String> listOfTitles = new ArrayList<>();
        String[] titleOfFile = file.list();
        for (String title : titleOfFile) {
            System.out.println(title);
            listOfTitles.add(title);
        }
        return listOfTitles;
    }

    public static String getFileByPath(String path) {
        String textFromFile = "";
        File necessaryFile = new File(path);
        if (necessaryFile.exists()) {
            try(FileInputStream fis = new FileInputStream(path)) {
                System.out.printf("File size: %d bytes \n", fis.available());
                int i;
                while ((i = fis.read()) != -1) {
                    textFromFile += (char) i;
                    System.out.print((char) i);
                }
                return textFromFile;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("FILE NOT EXIST");
            textFromFile = "FILE NOT EXIST";
        }
        return textFromFile;
    }

    public static String createFileOnServer(String path, String title) {
        String result = "";
        File creatingFileOnServer = new File(path, title);
        if (creatingFileOnServer.exists()) {
            System.out.println("FILE EXIST");
            result += "FILE EXIST";
        } else {
            try {
                creatingFileOnServer.createNewFile();
                System.out.println("FILE CREATING");
                result += "OK";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static String deleteFileOnServer(String path, String title) {
        String result = "";
        File deleteFileOnServer = new File(path, title);
        if (deleteFileOnServer.exists()) {
            deleteFileOnServer.delete();
            System.out.println("FILE DELETE");
            result += "OK";
        } else {
            System.out.println("FILE NOT EXIST");
            result += "FILE NOT EXIST";
        }
        return result;
    }
}
