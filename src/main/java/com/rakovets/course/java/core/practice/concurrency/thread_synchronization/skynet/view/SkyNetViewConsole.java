package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.controller.SkyNetStarterController;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWednesday;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model.FractionWorld;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FactoryThreadService;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.Random;

public class SkyNetViewConsole implements SkyNetView {
    private final FactoryThreadService factory = new FactoryThreadService();
    private final FractionWednesday fractionWednesday = new FractionWednesday(factory);
    private final FractionWorld fractionWorld = new FractionWorld(factory);

    public void skyNetView() {
        int days = 100;
        for (int i = 1; i <= days; i++) {
            SkyNetStarterController.factoryThread = new Thread(factory);
            SkyNetStarterController.factoryThread.start();
            try {
                SkyNetStarterController.factoryThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SkyNetStarterController.worldThread = new Thread(fractionWorld);
            SkyNetStarterController.wednesdayThread = new Thread(fractionWednesday);
            if (new Random().nextInt(2) == 0) {
                SkyNetStarterController.worldThread.start();
                SkyNetStarterController.wednesdayThread.start();
            } else {
                SkyNetStarterController.wednesdayThread.start();
                SkyNetStarterController.worldThread.start();
            }
            try {
                SkyNetStarterController.worldThread.join();
                SkyNetStarterController.wednesdayThread.join();
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
