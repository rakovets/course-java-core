package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.masterworker;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.*;

public class MasterThread {

    public static void main(String[] args) {
        MasterThread master = new MasterThread();
        master.run();
    }

    public void run() {
        Scanner enter = new Scanner(System.in);
        int number = 0;
        SharedResource shared = new SharedResource();
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        ThreadWorker thread = new ThreadWorker(shared);
        executorService.execute(thread);

        while (true) {
            System.out.print("Please enter the number\n");
            try {
                number = enter.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not allowed symbols");
                break;
            }
            if (number == -1) {
                break;
            }
            shared.queueNumbers.offer(number);
        }

        executorService.shutdownNow();

        StandardOutputUtil.printlnWithTimeAndThread("Program is finished", AnsiColorCode.FG_RED_BOLD);
    }
}
