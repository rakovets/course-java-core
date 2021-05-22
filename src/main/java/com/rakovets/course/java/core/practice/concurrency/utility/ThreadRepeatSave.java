package com.rakovets.course.java.core.practice.concurrency.utility;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.Queue;

public class ThreadRepeatSave implements Runnable {
    private String pathFile;
    private String pathForCopy;
    private Queue<String> queue;
    private long minute;

    public ThreadRepeatSave(String pathFile, String pathForCopy, Queue<String> queue, long minute) {
        this.pathFile = pathFile;
        this.pathForCopy = pathForCopy;
        this.queue = queue;
        this.minute = minute;
    }

    @Override
    public void run() {
        try {
            while (BackupUtility.getIsAlive()) {
                Thread reader = new Thread(new ThreadReader(pathFile, queue), "Thread - Reader");
                Thread writer = new Thread(new ThreadWriter(pathForCopy, queue), "Thread - Writer");
                reader.start();
                writer.start();

                Thread.sleep(minute * 1_000 * 20);
            }
        } catch (InterruptedException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);
        }
    }
}
