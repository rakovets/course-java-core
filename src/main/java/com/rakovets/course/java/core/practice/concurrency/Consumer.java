package com.rakovets.course.java.core.practice.concurrency;

import java.util.ArrayDeque;
import java.util.Queue;

public class Consumer extends Thread{
    private Queue <Integer> queue;

    public Consumer(Queue queue) {
        this.queue=queue;
    }

    @Override
    public void run() {
        getNumbersFromProducerThread();
    }

    public void getNumbersFromProducerThread () {
      while (true) {
          if (!queue.isEmpty()) {
              try {
                  System.out.println("I will sleep for" + queue.poll());
                  Thread.sleep(queue.poll()*1000);
                  System.out.println("I wake up)");
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
      }
    }
}
