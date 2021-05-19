package com.rakovets.course.java.core.practice.concurrency.threads;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Queue;

public class Consumer implements Runnable {
    Path path = Paths.get("src","main","resources","practice","text");
    boolean isAlive = true;

    public void run(){
        while (isAlive = true)
        try {
            System.out.println("started");
            FileWriter writer = new FileWriter(String.valueOf(path),true);
            if (Store.list.size() > 0){
                int priority = Store.list.element();
                if (priority == -1){
                    break;
                }
                Store.list.poll();
                System.out.println("Sleep");
                Thread.sleep(priority * 1000L);
                writer.write(LocalTime.now() + " " + Thread.currentThread().getName() + " - I slept " +  + priority + " seconds\n");
                }
            else {
                System.out.println("AFK");
                Thread.sleep(1000L);
                writer.write(LocalTime.now() + " " + Thread.currentThread().getName() + " ...\n");
            }
            writer.flush();
        }
        catch (InterruptedException | IOException exception){
            exception.printStackTrace();
        }
    }

}
