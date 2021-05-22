package com.rakovets.course.java.core.practice.concurrency.master_and_worker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Worker  extends Thread{
    private boolean isAlive;

    @Override
    public void run() {
        List<Integer> integerList = SharedResources.getListOfNumbers();
        int input = 0;
        while (isAlive) {
            try (FileWriter writer = new FileWriter("src/main/resources/practice/worker.txt", true)) {
                if (input == integerList.size()) {
                    Thread.sleep(1000);
                    Date date = new Date(System.currentTimeMillis());
                    writer.write(date + " " + Thread.currentThread().getName() + " - ...\n");
                }
                if (input < integerList.size() && integerList.get(input) != -1) {
                    Thread.sleep(integerList.get(input) * 1000);
                    Date date = new Date(System.currentTimeMillis());
                    writer.write(date + " " + Thread.currentThread().getName() + " - I slept " + integerList.get(input) + " seconds\n");
                    input++;
                } else if (input < integerList.size() && integerList.get(input) == -1) {
                    isAlive= false;
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
