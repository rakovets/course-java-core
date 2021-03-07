package com.rakovets.course.java.core.practice.concurrency.common.project_master_worker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class WorkerWriter {
    public static void write(String filepath, String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(filepath))) {
            String timestamp = new Timestamp(System.currentTimeMillis()).toString();
            bufferedWriter.write(timestamp + text);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
