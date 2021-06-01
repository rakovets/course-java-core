package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skyNet.*;
import java.util.LinkedList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<RobotParts> storageRobotParts = new LinkedList<>();
        LinkedList<RobotParts> robotPartFraction = new LinkedList<>();
        Storage storage = new Storage(storageRobotParts, 5);

        Factory factory = new Factory(storage);
        Fraction fraction1 = new Fraction(storage, robotPartFraction);
        Fraction fraction2 = new Fraction(storage, robotPartFraction);
        Thread producerFactory = new Thread(factory, "producerFactory");
        Thread worldFraction = new Thread(fraction1, "World");
        Thread wednesdayFraction = new Thread(fraction2, "Wednesday");

        producerFactory.start();
        worldFraction.start();
        wednesdayFraction.start();

        if (fraction1.getCountRobot() > fraction2.getCountRobot()) {
            System.out.println("World have more robots\nWorld robots " + fraction1.getCountRobot() + "\n"
                    + "Wednesday robots " + fraction2.getCountRobot());
        } else if (fraction1.getCountRobot() < fraction2.getCountRobot()) {
            System.out.println("Wednesday have more robots\nWednesday robots " + fraction2.getCountRobot() + "\n"
                    + "World robots " + fraction1.getCountRobot());
        } else {
            System.out.println("Draw robots\nWorld robots " + fraction1.getCountRobot() + "\n"
                    + "Wednesday robots " + fraction2.getCountRobot());
        }
    }
}
