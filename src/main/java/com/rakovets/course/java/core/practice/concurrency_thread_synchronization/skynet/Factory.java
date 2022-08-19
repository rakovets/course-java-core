package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.RandomUtil;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Factory implements Runnable {
    private static final Logger LOGGER = Logger.getLogger("Factory");
    private static final int MAXIMUM_DETAIL_PRODUCTION_PER_DAY = 10;
    @lombok.Getter
    private int day;
    @lombok.Getter
    private final Queue<Detail> details = new LinkedList<>();

    public Factory(int day) {
        this.day = day;
    }

    /**
     * Produces resources to create robots.
     */
    @Override
    public void run() {
        synchronized (details) {
            try {
                while (day > 0) {
                    if (!details.isEmpty()) {
                        LOGGER.info("Factory sleep");
                        details.notifyAll();
                        details.wait(300L);
                    }
                    IntStream.range(0, MAXIMUM_DETAIL_PRODUCTION_PER_DAY)
                            .mapToObj(j -> getRandomDetail())
                            .forEachOrdered(details::add);
                    day--;
                    String info = "Factory completed work." + details + " size: " + details.size();
                    LOGGER.info(info);
                    details.notifyAll();
                    details.wait(300L);
                }
            } catch (InterruptedException e) {
                LOGGER.log(Level.WARNING, e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Randomly selects objects to create.
     *
     * @return random do.
     */
    public Detail getRandomDetail() {
        DetailType[] types = DetailType.values();
        int randomTypesIndex = RandomUtil.getRandom(types.length);

        return DetailFactory.get(types[randomTypesIndex]);
    }
}
