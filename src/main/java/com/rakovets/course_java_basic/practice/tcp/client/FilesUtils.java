package main.java.com.rakovets.course_java_basic.practice.tcp.client;

import java.io.*;
import java.net.Socket;

public class FilesUtils {

    public void sendFilies() throws IOException {
        Socket socket = null;
        String host = "8080";

        socket = new Socket("127.0.0.1", 8080);

        File file = new File("D:\\dev2\\java-practice\\src\\main\\java\\com\\rakovets\\course_java_basic\\practice\\tcp\\task08.txt");
        long length = file.length();
        byte[] bytes = new byte[16 * 1024];
        InputStream in = new FileInputStream(file);
        OutputStream out = socket.getOutputStream();

        int count;
        while ((count = in.read(bytes)) > 0) {
            out.write(bytes, 0, count);
        }

        out.close();
        in.close();
        socket.close();
    }

    public String[] showAllFilesPath() {
            File f = new File("D:\\dev2\\java-practice");
            String[] pathnames;
            pathnames = f.list();
            for (String pathname : pathnames) {
                System.out.println(pathname);
            }
        return pathnames;
    }
}
