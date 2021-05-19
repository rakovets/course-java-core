package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Integer> queue;
    private Thread thread;
    private String filePath;

    public Consumer(Queue<Integer> queue, Thread thread, String filePath) {
        this.queue = queue;
        this.thread = thread;
        this.filePath = filePath;
    }

    @Override
    public void run() {

        while (true) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(""))) {
                if (!thread.isAlive()) {
                    break;
                }

                if (queue.isEmpty()) {
                    Thread.sleep(1_000);
                } else {
                    int i = queue.remove();
                    Thread.sleep(i * 1000);
                    writer.write(i);
                    writer.flush();
                    StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
                }
            } catch (InterruptedException ex) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);
            } catch (IOException ioEx) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "There is a problem with writing", AnsiColorCode.RESET);
            }
        }
    }
}
