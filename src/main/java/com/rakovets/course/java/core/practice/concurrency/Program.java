package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Properties;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        Path userPropertiesPath = Paths.get("src", "main", "java", "com.rakovets.course.java.core",
                "practice.concurrency", "users.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(userPropertiesPath.toFile())) {
            p.load(reader);
        } catch (IOException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with writing path for properties", AnsiColorCode.RESET);
        }

        String filePath = p.getProperty("filePath");

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.printf("%s%s%s\n", AnsiColorCode.FG_BLUE_BOLD, "THE PROGRAM HAS STARTED:", AnsiColorCode.RESET);
        Thread thread1 = new Thread(new Producer(queue), "Producer");
        Thread thread2 = new Thread(new Consumer(queue, thread1, filePath), "Consumer");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);
        }
        System.out.printf("%s%s%s\n", AnsiColorCode.FG_BLUE_BOLD, "THE PROGRAM HAS FINISHED:", AnsiColorCode.RESET);

    System.out.println(queue.toString());
    }
}
