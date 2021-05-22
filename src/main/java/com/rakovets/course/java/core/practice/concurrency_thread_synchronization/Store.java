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
    private List<Integer> storage = new ArrayList<>();
    Path filePath = Paths.get("src", "main", "resources", "practice", "ProducerConsumer.txt");

    public synchronized void produce() throws IOException {
        while (storage.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        storage.add(new Random().nextInt(100));
        BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath), true));
        writer.write("One item has been added to the store.\n");
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
        writer.write("One item has been purchased.\n");
        notify();
        writer.close();
    }
}
