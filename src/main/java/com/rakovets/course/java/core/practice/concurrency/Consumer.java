package com.rakovets.course.java.core.practice.concurrency;

import java.time.LocalDateTime;

public class Consumer implements Runnable {
    private final QueueContainer queueContainer;
    private final FileHelper fileHelper;

    public Consumer(QueueContainer queueContainer, FileHelper fileHelper) {
        this.queueContainer = queueContainer;
        this.fileHelper = fileHelper;
    }

    @Override
    public void run() {
        while (true) {
            Integer value = queueContainer.getItem();
            if (value != null) {
                try {
                    Thread.sleep(value * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                fileHelper.addLineToFile(String.format("${%s} - ${%s} - I slept ${%d} seconds \n", LocalDateTime.now(), Thread.currentThread().getName(), value));
            } else {
                try {
                    fileHelper.addLineToFile(String.format("${%s} - ${%s} - ...\n", LocalDateTime.now(), Thread.currentThread().getName()));
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
