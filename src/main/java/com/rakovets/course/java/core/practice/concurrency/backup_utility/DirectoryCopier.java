package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.io.*;
import java.util.logging.Logger;

public class DirectoryCopier extends  Thread {
    private final CommonStringQueue commonStringQueue;
    public DirectoryCopier(ThreadGroup threadGroup, String name, CommonStringQueue commonStringQueue) {
        super(threadGroup, name);
        this.commonStringQueue = commonStringQueue;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(DirectoryCopier.class.getName());
        logger.info("Thread DirectoryCopier started");
        while (!Thread.currentThread().isInterrupted()) {
            String dirName = "";
            String addToCopyName = "_copy";
            File dir = null;
            File copyDir = null;
            boolean isNotEmpty = false;
            boolean isGoodDirName = true;
            if (commonStringQueue.checkStringInQueue() != null) {
                dirName = commonStringQueue.removeStringFromQueue();
                isNotEmpty = true;
                if (isNotEmpty) {
                    logger.info(Thread.currentThread().getName() + " получил из очереди имя директории " + dirName);
                    dir = new File(dirName);
                    copyDir = new File(dirName.concat(addToCopyName));
                    try {
                        copyDir.mkdir();
                    } catch (SecurityException e) {
                        logger.info("Check name of directory");
                        isGoodDirName = false;
                    }
                }
                if (isGoodDirName) {
                    try {
                        for (File item : dir.listFiles()) {
                            try (BufferedInputStream fin = new BufferedInputStream(new FileInputStream(item.getAbsolutePath()));
                                 BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(item.getParent().concat(addToCopyName) + File.separator + item.getName().concat(addToCopyName)))) {
                                byte[] buffer = new byte[fin.available()];
                                fin.read(buffer, 0, buffer.length);
                                fos.write(buffer, 0, buffer.length);
                            } catch (IOException ex) {
                                logger.info("Coping failed");
                            }
                        }
                    } catch (NullPointerException e) {
                        logger.info("Данный директорий не существуетю Введите правильное имя");
                    }
                }
            } else {
                try {
                    Thread.currentThread().sleep(3000);
                } catch (InterruptedException e) {
                    logger.info(e.getMessage());
                    Thread.currentThread().interrupt();
                }
            }
        }
        logger.info("Thread DirectoryCopier is also finished");
    }
}
