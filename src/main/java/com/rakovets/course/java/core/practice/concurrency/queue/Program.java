package com.rakovets.course.java.core.practice.concurrency.queue;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Properties;
import java.util.Queue;

public class Program {
    static boolean isInterrupt;

    public static void setIsInterrupt (boolean isInterrupt) {
        Program.isInterrupt = isInterrupt;
    }

    public static void main(String[] args) {

        Path userPropertiesPath = Paths.get("src", "main", "resources", "users.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(userPropertiesPath.toFile())) {
            p.load(reader);
        } catch (IOException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with writing path for properties", AnsiColorCode.RESET);
        }

        String filePath = p.getProperty("filePath");

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("");
        } catch (IOException IOex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a file cleanup problem", AnsiColorCode.RESET);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.printf("%s%s%s\n", AnsiColorCode.FG_BLUE_BOLD, "THE PROGRAM HAS STARTED:", AnsiColorCode.RESET);
        Thread thread1 = new Thread(new Producer(queue), "Producer");
        Thread thread2 = new Thread(new Consumer(queue, filePath), "Consumer - 1");
        Thread thread3 = new Thread(new Consumer(queue, filePath), "Consumer - 2");
        Thread thread4 = new Thread(new Consumer(queue, filePath), "Consumer - 3");
        Thread thread5 = new Thread(new Consumer(queue, filePath), "Consumer - 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();

        } catch (InterruptedException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);
        }
        System.out.printf("%s%s%s\n", AnsiColorCode.FG_BLUE_BOLD, "THE PROGRAM HAS FINISHED:", AnsiColorCode.RESET);
    }
}
