package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

import java.io.*;
import java.sql.Timestamp;
import java.util.Scanner;

public class ThreadWorker implements Runnable {
    @Override
    public void run() {
        File file = new File("D:\\home\\dev\\course-java-basics\\src\\main\\resources\\practice","test.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int inputSeconds;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                FileWriter fw = new FileWriter(file, true);
                if (!scanner.hasNextInt()) {
                    throw new UserInputException("Enter number");
                }
                inputSeconds = scanner.nextInt();
                if (inputSeconds == -1) {
                    break;
                } else if (inputSeconds < -1) {
                    throw new UserInputException("Enter positive number");
                }
                fw.append(new Timestamp(System.currentTimeMillis()) + " - I slept " + inputSeconds + " seconds\n");
                Thread.sleep( inputSeconds * 1000L);
                fw.close();
            } catch (UserInputException | InterruptedException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
