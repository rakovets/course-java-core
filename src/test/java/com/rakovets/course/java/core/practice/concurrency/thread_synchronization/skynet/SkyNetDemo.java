package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.Random;

public class SkyNetDemo {
    public static void main(String[] args) {

        FactoryThread factory = new FactoryThread();
        FractionWednesday fractionWednesday = new FractionWednesday(factory);
        FractionWorld fractionWorld = new FractionWorld(factory);
        Thread factoryThread;
        Thread wednesdayThread;
        Thread worldThread;

        int days = 100;
        for (int i = 1; i <= days; i++) {
            StandardOutputUtil.println("DAY " + i, AnsiColorCode.FG_BLACK_BOLD);
            factoryThread = new Thread(factory);
            factoryThread.start();
            try {
                factoryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            worldThread = new Thread(fractionWorld);
            wednesdayThread = new Thread(fractionWednesday);
            if (new Random().nextInt(2) == 0) {
                worldThread.start();
                wednesdayThread.start();
            } else {
                wednesdayThread.start();
                worldThread.start();
            }
            try {
                worldThread.join();
                wednesdayThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        StandardOutputUtil.println("\n" + "AFTER 100 DAYS:", AnsiColorCode.FG_BLACK_BOLD);
        StandardOutputUtil.println("FRACTION WEDNESDAY CREATED " +
                fractionWednesday.fractionRobot.robot.size() + " ROBOTS", AnsiColorCode.FG_MAGENTA_UNDERLINED);
        StandardOutputUtil.println("FRACTION WORLD CREATED " +
                fractionWorld.fractionRobot.robot.size() + " ROBOTS", AnsiColorCode.FG_MAGENTA_UNDERLINED);

        if (fractionWednesday.fractionRobot.robot.size() > fractionWorld.fractionRobot.robot.size())
            StandardOutputUtil.println("FRACTION WEDNESDAY HAS STRONGER ARMY",
                    AnsiColorCode.FG_YELLOW_BOLD);
        else if (fractionWednesday.fractionRobot.robot.size() < fractionWorld.fractionRobot.robot.size())
            StandardOutputUtil.println("FRACTION WORLD HAS STRONGER ARMY",
                    AnsiColorCode.FG_YELLOW_BOLD);
        else
            StandardOutputUtil.println("FRACTIONS ARMIES ARE EQUAL",
                    AnsiColorCode.FG_YELLOW_BOLD);
    }
}
