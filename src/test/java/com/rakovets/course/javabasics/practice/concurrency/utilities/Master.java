package com.rakovets.course.javabasics.practice.concurrency.utilities;

import com.rakovets.course.javabasics.practice.concurrency.utilities.masterworkers.Worker;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Master {
    public static void main(String[] args) {
        Worker worker = new Worker();
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(worker);
        Scanner input = new Scanner(System.in);
        int num;
        while (true) {
            try {
                num = Integer.parseInt(input.nextLine());
                worker.getQueue().offer(num);
                if (num == -1) {
                    service.shutdown();
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(("Data is incorrect!"));
            }
        }
    }
}
