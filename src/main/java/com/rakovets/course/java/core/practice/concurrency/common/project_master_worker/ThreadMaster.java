package com.rakovets.course.java.core.practice.concurrency.common.project_master_worker;

import java.util.Scanner;

public class ThreadMaster extends Thread {
    CommonResourse resourse;

    public ThreadMaster(CommonResourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {
        System.out.printf("%s Started: \n", Thread.currentThread().getName());
        Scanner scanner = new Scanner(System.in);
        {
            try {
                while (!Thread.interrupted()) {
                    int number = scanner.nextInt();
                    if (number > 0) {
                        resourse.commonList.add(number);
                    } else if (number == -1) {
                        resourse.commonList.add(-1);
                        currentThread().interrupt();
                    } else {
                        throw new UserInputException("Incorrect data was entered");
                    }
                }
            } catch (UserInputException e) {
                e.printStackTrace();
            }
        }
    }
}
