package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.util.NoSuchElementException;
import java.util.Queue;

public class Consumer extends Thread {
    private final Queue<Integer> integerQueue;

    public Consumer(Queue<Integer> integerQueue) {
        this.integerQueue = integerQueue;
    }

    public void run() {
        while (true) {
            try {
                int f = integerQueue.remove();
                if (f == -1){
                    break;
                }
                System.out.println("Consumer = " + f);
                sleep(f * 1000);
            }catch (NoSuchElementException x){
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
