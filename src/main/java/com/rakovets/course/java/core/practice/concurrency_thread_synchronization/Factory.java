package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.*;

public class Factory implements Runnable {
    private static Map<Details, Integer> details = new HashMap<>();
    private static List<Details> detail = new LinkedList<>();

    public synchronized static Details getDetails() {
        return detail.remove(0);
    }

    private void createDetails() {
        int countNewDetails = new Random().nextInt(10);

        for (int i = 0; i < countNewDetails; i++) {
            int serialNumber = new Random().nextInt(4);

            switch (serialNumber) {
                case (1):
                    detail.add(Details.HEAD);
                    break;
                case (2):
                    detail.add(Details.TORSO);
                    break;
                case (3):
                    detail.add(Details.HAND);
                    break;
                case (4):
                    detail.add(Details.FEET);
                    break;
            }
        }
    }

    @Override
    public void run() {
        createDetails();
    }
}
