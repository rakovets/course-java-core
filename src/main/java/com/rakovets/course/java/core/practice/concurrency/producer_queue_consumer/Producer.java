package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Producer extends Thread {
    private Queue<Integer> numbers;

    public Producer(Queue<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x != -1) {
            try {
                x = sc.nextInt();
                if (x < -1) {
                    throw new UserInputException("Incorrect input. Try positive number");
                } else {
                    numbers.add(x);
                }
            } catch (UserInputException e) {
                System.out.println(e.getMessage());
                x = 0;
            }
        }
        sc.close();
    }
}
