package com.rakovets.course.java.core.practice.concurrency.utility;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.*;
import java.util.Queue;

public class ThreadWriter implements Runnable {
    private String  directoryForCopy;
    private Queue<String> queue;

    public ThreadWriter(String directoryForCopy, Queue<String> queue) {
        this.directoryForCopy = directoryForCopy;
        this.queue = queue;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(directoryForCopy + "Copy.txt", false))) {
            do {
                String text = "";
                while ((text = queue.poll()) != null) {
                    writer.write(text + "\n");
                }
            } while (!BackupUtility.getIsReaderEnd());
        } catch(IOException ex){
            System.out.printf("%s%s%s", AnsiColorCode.FG_RED_BOLD, "There was a problem writing the file.",
                    AnsiColorCode.RESET);
        }
    }
}
