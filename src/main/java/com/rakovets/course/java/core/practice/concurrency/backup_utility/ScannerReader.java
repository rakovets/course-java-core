package com.rakovets.course.java.core.practice.concurrency.backup_utility;

import java.util.Scanner;
import java.util.logging.Logger;

public class ScannerReader extends Thread {
    private final CommonStringQueue commonStringQueue;
    public ScannerReader(ThreadGroup threadGroup, String name, CommonStringQueue commonStringQueue) {
        super(threadGroup, name);
        this.commonStringQueue = commonStringQueue;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(ScannerReader.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter correctly the name of directory to be copied. Enter q to exit");
        while (scanner.hasNext()) {
            String i = scanner.next();
            if (i.toLowerCase().charAt(0) != 'q') {
                commonStringQueue.addStringToQueue(i);
                logger.info(Thread.currentThread().getName() + " entered to queue: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    logger.info(e.getMessage());
                }
            } else {
                logger.info("Thread Producer is ended by entering q.");
                scanner.close();
                Thread.currentThread().getThreadGroup().interrupt();
                logger.info("Все потоки в группе переведены в состояние interrupt.");
                break;
            }
            logger.info("В очереди сейчас следующие имена директориев: " + commonStringQueue.getQueue().toString());
        }
    }
}
