package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Timestamp;

public class WorkThread  implements Runnable {
    private final CommonResource comRes;
    private boolean isAlive;

    public WorkThread(CommonResource comRes) {
        this.comRes = comRes;
        isAlive = true;
    }

    @Override
    public void run() {
        File filepath = Path.of("src", "main", "resources", "practice", "master_worker.txt").toFile();
        int elementQueue;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true))) {
            while (isAlive) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                if (comRes.queue.peek() != null) {
                    if (comRes.queue.peek() == -1) {
                        System.out.println("Program finished");
                        isAlive = false;
                    } else {
                        elementQueue = comRes.queue.poll();
                        bw.write(timestamp + " I slept - " + elementQueue + " seconds");
                        bw.newLine();
                        Thread.sleep(elementQueue * 1000L);
                    }
                } else {
                    bw.write(timestamp + " - ...");
                    bw.newLine();
                    Thread.sleep(1000L);
                }
            }
        } catch (NullPointerException e3) {
            System.out.println("NullPointerException");
        } catch (IOException e1) {
            System.out.println("File ERROR");
        } catch (InterruptedException e2) {
            System.out.println("Thread.sleep ERROR");;
        }
    }
}
