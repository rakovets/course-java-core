package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Integer> queue;
    private Thread thread;

    public Consumer(Queue<Integer> queue, Thread thread) {
        this.queue = queue;
        this.thread = thread;
    }

    @Override
    public void run() {
        while (true) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("txt"))) {
                if (!thread.isAlive()) {
                    break;
                }

                if (queue.isEmpty()) {
                    Thread.sleep(1_000);
                } else {
                    int i = queue.remove();
                    Thread.sleep(i * 1000);



                }
            } catch (InterruptedException ex) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);
            } catch (IOException ioEx) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "There is a problem with writing", AnsiColorCode.RESET);
            }

        }
    }
}
