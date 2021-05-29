package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Queue;

public class Store {
    Queue<Integer> queue = new ArrayDeque<>();
    String filePath;

    public Store(String filePath) {
        this.filePath = filePath;
    }

    public synchronized void produce(int number) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            while (queue.size() >= 10) {
                writer.write(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wait\n");
                System.out.println(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wait");
                wait();
                writer.write(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wake up\n");
                System.out.println(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wake up");
            }

            queue.add(number);
            writer.write(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() +
                    " get number - " + number + "\n");
            System.out.println(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() +
                    " get number - " + number);
            notify();

        } catch (IOException exceptionProducer) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with writing producer numbers", AnsiColorCode.RESET);
        } catch (InterruptedException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with waiting for a thread", AnsiColorCode.RESET);
        }
    }

    public synchronized void consumer() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            while (queue.size() == 0) {
                writer.write(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wait\n");
                System.out.println(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wait");
                wait();
                writer.write(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wake up\n");
                System.out.println(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() + " wake up");
            }

            int number = queue.remove();
            writer.write(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() +
                    " put number - " + number +"\n");
            System.out.println(LocalDateTime.now().toString() + " " + Thread.currentThread().getName() +
                    " put number - " + number);
            notify();

        } catch (IOException exceptionProducer) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with writing producer numbers", AnsiColorCode.RESET);
        } catch (InterruptedException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with waiting for a thread", AnsiColorCode.RESET);
        }
    }
}
