package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Master implements Runnable {
    private Queue<Integer> commonResource;
    private ReentrantLock lock;

    public Master(Queue<Integer> commonResource,ReentrantLock lock) {
        this.commonResource = commonResource;
        this.lock = lock;
    }

    @Override
    public void run ()  {
        Integer numberIntegerType;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please,enter your number, your number must be more then 0. If you want no end this program enter -1");
            try {
                int number = scanner.nextInt();
                if (number == -1) {
                    lock.lock();
                    Worker.setStatus(false);
                    lock.unlock();
                    break;
                } else if (number < -1) {
                    throw new UserInputException("You entered the wrong value,please try again");
                } else {
                    numberIntegerType = number;
                    commonResource.add(numberIntegerType);
                }
            } catch (UserInputException userInputException) {
                System.out.println(userInputException.getMessage());
            }
        }
    }
}
