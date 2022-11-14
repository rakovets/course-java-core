package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_04;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_03.Store;

import java.util.logging.Logger;

public class ProducerThread extends Thread {
    Logger logger = Logger.getLogger(ProducerThread.class.getName());
    private Store store;
    public ProducerThread(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (store.getDeque().size() < 10) {
                synchronized (store) {
                    if (store.getLastNumberInDeque() == 0) {
                        logger.info("Очередь пустая");
                        store.produce(2);
                        logger.info(Thread.currentThread().getName() + " добавил в очередь первую цифру 2");
                    } else {
                        int lastInDeque = store.getLastNumberInDeque();
                        boolean nextPrimeNumberIsNotGenerateYet = true;
                        logger.info("В очереди последняя цифра была " + lastInDeque);
                        lastInDeque++;
                        for (int i = lastInDeque; nextPrimeNumberIsNotGenerateYet; i++) {
                            boolean isPrimeNumber = true;
                            for (int j = 2; j < i; j++) {
                                if (i % j == 0) {
                                    isPrimeNumber = false;
                                    break;
                                }
                            }
                            if (isPrimeNumber) {
                                store.produce(i);
                                logger.info(Thread.currentThread().getName() + " в конец очереди добавил цифру " + i);
                                logger.info("Сейчас в очереди цифры: " + store.getDeque().toString());
                                nextPrimeNumberIsNotGenerateYet = false;
                            }
                        }
                    }
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
    }
}
