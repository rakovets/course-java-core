package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.service;

import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.repository.CommonResourceRepository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadWorkerService implements Callable<Object> {
    private final CommonResourceRepository commonResourceRepository;
    public static int numberOfThreads;
    private final List<Future<?>> futures = new ArrayList<>();
    private static final Path filePath;
    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    static {

        numberOfThreads = 2;
        filePath = Paths.get("src", "main", "resources", "MasterWorker.txt");

    }

    public ThreadWorkerService(CommonResourceRepository commonResourceRepository) {
        this.commonResourceRepository = commonResourceRepository;
    }

    public Object call() throws InterruptedException, ExecutionException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)))) {
            ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
            while (true) {
                if (!commonResourceRepository.list.isEmpty()) {
                    int numberOfSeconds = commonResourceRepository.list.poll();
                    if (numberOfSeconds > -1) {
                        writer.write(timestamp + " - I slept " + numberOfSeconds + " seconds");
                        writer.newLine();
                    }
                    if (numberOfSeconds == -1) {
                        executor.shutdownNow();
                        break;
                    }
                    futures.add(executor.submit(new SleepSecondsService(numberOfSeconds)));
                }
                for (Future<?> future : futures)
                    future.get();
                writer.write(timestamp + " - ...");
                writer.newLine();
                sleep();
            }
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
