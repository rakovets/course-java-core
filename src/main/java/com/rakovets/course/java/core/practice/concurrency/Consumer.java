package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Integer> queue;
    private final Thread thread;
    private final String filePath;

    public Consumer(Queue<Integer> queue, Thread thread, String filePath) {
        this.queue = queue;
        this.thread = thread;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        while (true) {
            if (!thread.isAlive()) {
                break;
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                Integer i = queue.poll();
                if (i == null) {
                    Thread.sleep(1000);
                    writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() + " ...\n");
                } else {
                    Thread.sleep(i * 1000L);
                    writer.write (LocalDateTime.now() + "I slept " + i + " seconds\n");
                }

                writer.flush();
            } catch (InterruptedException ex) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);

            } catch (IOException ioEx) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "There is a problem with writing", AnsiColorCode.RESET);
            }
        }
    }
}
