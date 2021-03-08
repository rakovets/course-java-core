package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.controller.SkyNetController;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWednesday;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWorld;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FactoryService;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.Random;

public class SkyNetViewConsole implements SkyNetView {
    private final FactoryService factory = new FactoryService();
    private final FractionWednesday fractionWednesday = new FractionWednesday(factory);
    private final FractionWorld fractionWorld = new FractionWorld(factory);

    public void skyNetView() {
        for (int i = 1; i <= SkyNetController.daysOfArmiesComparison; i++) {
            SkyNetController.factoryThread = new Thread(factory);
            SkyNetController.factoryThread.start();
            try {
                SkyNetController.factoryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SkyNetController.worldThread = new Thread(fractionWorld);
            SkyNetController.wednesdayThread = new Thread(fractionWednesday);
            if (new Random().nextInt(2) == 0) {
                SkyNetController.worldThread.start();
                SkyNetController.wednesdayThread.start();
            } else {
                SkyNetController.wednesdayThread.start();
                SkyNetController.worldThread.start();
            }
            try {
                SkyNetController.worldThread.join();
                SkyNetController.wednesdayThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n" + "AFTER 100 DAYS:");
        System.out.println("FRACTION 'WEDNESDAY' CREATED " +
                fractionWednesday.fractionRobotRepository.robot.size() + " ROBOTS");
        System.out.println("FRACTION 'WORLD' CREATED " +
                fractionWorld.fractionRobotRepository.robot.size() + " ROBOTS");

        if (fractionWednesday.fractionRobotRepository.robot.size() > fractionWorld.fractionRobotRepository.robot.size())
            StandardOutputUtil.println("FRACTION 'WEDNESDAY' HAS STRONGER ARMY", AnsiColorCode.FG_RED_BOLD);
        else if (fractionWednesday.fractionRobotRepository.robot.size() < fractionWorld.fractionRobotRepository.robot.size())
            StandardOutputUtil.println("FRACTION 'WORLD' HAS STRONGER ARMY", AnsiColorCode.FG_RED_BOLD);
        else
            StandardOutputUtil.println("FRACTIONS ARMIES ARE EQUAL",
                    AnsiColorCode.FG_RED_BOLD);
    }
}
