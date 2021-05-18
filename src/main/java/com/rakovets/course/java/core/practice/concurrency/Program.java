package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.printf("%s%s%s\n", AnsiColorCode.FG_BLUE_BOLD, "THE PROGRAM HAS STARTED:", AnsiColorCode.RESET);
        Thread thread1 = new Thread(new Producer(queue), "Producer");

        thread1.start();
        try {
            thread1.join();

        } catch (InterruptedException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);
        }
        System.out.printf("%s%s%s\n", AnsiColorCode.FG_BLUE_BOLD, "THE PROGRAM HAS FINISHED:", AnsiColorCode.RESET);

    System.out.println(queue.toString());
    }
}
