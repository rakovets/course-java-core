package com.rakovets.course.java.core.practice.concurrency.common.masterAndWorker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ThreadWorker extends Thread {
    private List<Integer> listOfNumbers;

    public ThreadWorker(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run() {
        int counter = 0;
        int sleepCounter = 0;
        while (!(listOfNumbers.get(counter) == -1)) {
            for ( ; counter < listOfNumbers.size(); ) {
                try (FileWriter writer = new FileWriter("src/test/resources/practice/concurrency/masterWorker/worker.txt", true)) {
                    Thread.sleep(listOfNumbers.get(counter) * 1000);
                    writer.write("I sleep " + listOfNumbers.get(counter));
                    writer.close();
                    System.out.println("i sleeped==");
                    counter++;
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }
            if (sleepCounter == listOfNumbers.size()) {
                try {
                    Thread.sleep(1000);
                    sleepCounter++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
