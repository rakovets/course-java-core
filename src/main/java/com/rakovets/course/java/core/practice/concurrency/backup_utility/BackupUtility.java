package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Logger;

public class BackupUtility extends Thread {
    public BackupUtility(String name) {
        super(name);
    }
    @Override
    public void run() {
        Logger logger = Logger.getLogger(BackupUtility.class.getName());
        Queue<String> queue = new ArrayDeque<>();
        CommonStringQueue commonStringQueue = new CommonStringQueue(queue);
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        Thread scannerReader = new ScannerReader(threadGroup, "ScannerReader", commonStringQueue);
        Thread directoryCopier = new DirectoryCopier(threadGroup, "DirectoryCopier", commonStringQueue);
        try {
            scannerReader.start();
            directoryCopier.start();
        } catch (NullPointerException e) {
            logger.info("Неправильно введено имя директория");
        }
    }
}
