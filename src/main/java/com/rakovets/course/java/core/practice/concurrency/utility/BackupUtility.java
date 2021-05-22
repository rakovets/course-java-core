package com.rakovets.course.java.core.practice.concurrency.utility;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class BackupUtility {
    public static boolean isReaderEnd = false;

    public static void setIsReaderEnd(boolean isReaderEnd) {
        BackupUtility.isReaderEnd = isReaderEnd;
    }

    public static boolean getIsReaderEnd() {
        return isReaderEnd;
    }

    public static void getCopy(String pathFile, String pathForCopy, long periodOfMinutes) {
        Queue<String> queue = new ArrayDeque<>();

        System.out.printf("%s%s%s\n",  AnsiColorCode.FG_BLUE_BOLD, "PROGRAM COPY STARTED", AnsiColorCode.RESET);
        Thread repeatSave = new Thread(new ThreadRepeatSave(pathFile, pathForCopy, queue, periodOfMinutes),
                "Thread - RepeatSave");
        Thread commuter = new Thread(new ThreadCommuter(periodOfMinutes, repeatSave), "Thread - Commuter");

        commuter.start();
        repeatSave.start();

        try {
            commuter.join();
            repeatSave.join();

        } catch (InterruptedException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, "Thread has been interrupted", AnsiColorCode.RESET);
        }
        System.out.printf("%s%s%s\n", AnsiColorCode.FG_BLUE_BOLD, "THE PROGRAM HAS FINISHED:", AnsiColorCode.RESET);
    }
}
