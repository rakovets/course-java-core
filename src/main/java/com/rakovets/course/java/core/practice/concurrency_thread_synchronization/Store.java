package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private final List<Integer> storage = new ArrayList<>();
    Path filePath = Paths.get("src", "main", "resources", "practice", "producer_consumer.txt");

    public synchronized void produce() throws IOException {
        while (storage.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        storage.add(new Random().nextInt(100));
        BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath), true));
        writer.write("One number added.\n");
        notify();
        writer.close();
    }

    public synchronized void consume() throws IOException {
        while (storage.size() <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath), true));
        storage.remove(0);
        writer.write("One number is taken.\n");
        notify();
        writer.close();
    }
}
