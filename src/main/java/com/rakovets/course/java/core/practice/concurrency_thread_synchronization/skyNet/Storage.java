package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skyNet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Storage {
    private static List<RobotParts> storageRobotParts = new LinkedList<>();
    RobotParts robotParts;
    private int numberOfRobotParts = 10;
    private static int limitDays;
    private static int days = 1;
    private Random random = new Random();
    private boolean isWorkingTime = true;

    public Storage(List<RobotParts> storageRobotParts, int limitDays) {
        this.storageRobotParts = storageRobotParts;
        this.limitDays = limitDays;
    }

    public synchronized void makeRobotParts() {
        if (storageRobotParts.size() > numberOfRobotParts) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        } else {
            for (int i = 0; i < numberOfRobotParts; i++) {
                int robotParts = random.nextInt(4);
                switch (robotParts) {
                    case 0:
                        storageRobotParts.add(RobotParts.HEAD);
                        break;
                    case 1:
                        storageRobotParts.add(RobotParts.TORSO);
                        break;
                    case 2:
                        storageRobotParts.add(RobotParts.HAND);
                        break;
                    case 3:
                        storageRobotParts.add(RobotParts.FEET);
                        break;
                }
                System.out.println(Thread.currentThread().getName() + " produce robot part: " + robotParts + ".");
                System.out.println("StorageRobotParts size: " + storageRobotParts.size() + ".");
            }
        }
        getNextDay();
        isStatus(false);
        notifyAll();
    }

    public synchronized void getDetails(LinkedList<RobotParts> robotPartFraction) {
        if (storageRobotParts.isEmpty()) {
            try {
                System.out.println("Fraction is waiting");
                Thread.sleep(5000);
                wait();
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        } else {
            for (int j = 1; j <= 5; j++) {
                robotPartFraction.add(Storage.removeRobotParts());
            }
        }
        getNextDay();
        isStatus(true);
        notify();
    }

    public boolean getStatus() {
        return isWorkingTime ;
    }

    public boolean isStatus(boolean isWorkingTime) {
        return isWorkingTime;
    }

    public static RobotParts removeRobotParts() {
        return storageRobotParts.remove(0);
    }

    public List<RobotParts> getStorageRobotParts() {
        return storageRobotParts;
    }

    public static void getNextDay() {
        days++;
    }

    public static int getDays() {
        return days;
    }

    public static int getLimitDays() {
        return limitDays;
    }

    public void kill() {
        isWorkingTime = false;
    }
}
