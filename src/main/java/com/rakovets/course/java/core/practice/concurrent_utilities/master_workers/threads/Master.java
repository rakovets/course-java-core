package com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.threads;

import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.OutputMessage;
import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.SharedResource;
import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.UserInputException;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Master implements Runnable {
    private final SharedResource sharedResource;
    private final Scanner cin = new Scanner(System.in);
    private final ReentrantLock lock;

    public Master(SharedResource sharedResource, ReentrantLock lock) {
        this.sharedResource = sharedResource;
        this.lock = lock;
    }

    @Override
    public void run() {
        OutputMessage.startThreadMessage(Thread.currentThread());
        while (true) {
            lock.lock();
            try {
                int number = cin.nextInt();
                if (number == -1) {
                    sharedResource.addNumberToList(number);
                    break;
                }
                sharedResource.addNumberToList(number);
            } catch (InputMismatchException ex) {
                throw new UserInputException("Wrong input");
            }
            lock.unlock();
        }
        System.out.printf("%s\n", sharedResource.getListOfNumbers());
        OutputMessage.endThreadMessage(Thread.currentThread());
    }
}
