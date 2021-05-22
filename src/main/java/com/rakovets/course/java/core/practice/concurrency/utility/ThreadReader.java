package com.rakovets.course.java.core.practice.concurrency.utility;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;

public class ThreadReader implements Runnable {
    private String filePath;
    private Queue<String> queue;

    public ThreadReader (String filePath, Queue<String> queue) {
        this.filePath = filePath;
        this.queue = queue;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String text = "";
                while ((text = reader.readLine()) != null) {
                    queue.add(text);
                 }
                BackupUtility.setIsReaderEnd(true);

        } catch (IOException ex) {
            System.out.printf("%s%s%s",  AnsiColorCode.FG_RED_BOLD, "There was a problem reading the file.",
                    AnsiColorCode.RESET);
        }
    }
}
