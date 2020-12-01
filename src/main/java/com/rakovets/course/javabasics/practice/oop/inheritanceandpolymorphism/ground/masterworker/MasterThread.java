package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.masterworker;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterThread {
    Scanner enter = new Scanner(System.in);
    int number = 0;
    SharedResource shared = new SharedResource();
    ThreadWorker thread = new ThreadWorker(shared);
        thread.start();

        while (true) {
        System.out.print("Please enter the number\n");
        try {
            number = enter.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not allowed symbols");
            break;
        }
        if (number == -1 ) {
            break;
        }
        shared.queueNumbers.offer(number);
    }
    shared.isFinished = true;
        StandardOutputUtil.printlnWithTimeAndThread("For-loop of main thread is finished", AnsiColorCode.FG_RED_BOLD);

        try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        StandardOutputUtil.printlnWithTimeAndThread("Program is finished", AnsiColorCode.FG_RED_BOLD);
}
}
