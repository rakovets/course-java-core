package com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.threads;

import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.OutputMessage;
import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.SharedResource;
import com.rakovets.course.java.core.practice.concurrent_utilities.master_workers.UsedPaths;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
    private final SharedResource sharedResource;
    private final UsedPaths usedPaths = new UsedPaths();

    public Worker(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        OutputMessage.startThreadMessage(Thread.currentThread());
        int element;
        while (true) {
            try {
                FileWriter writer = new FileWriter(String.valueOf(usedPaths.getPathToWorkerWorkResult()), true);
                if (!sharedResource.isEmpty()) {
                    if (sharedResource.getElementFromList() == -1) {
                        break;
                    } else {
                        element = sharedResource.getElementFromList();
                        OutputMessage.workingInProgress(Thread.currentThread());
                        Thread.sleep(element * 1000L);
                        writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName()
                                + " - I slept " + element + " seconds\n");
                        sharedResource.removeFirstElement();
                    }
                } else {
                    Thread.sleep(1000L);
                    writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() + " ...\n");
                }
                writer.flush();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        OutputMessage.endThreadMessage(Thread.currentThread());
    }
}
