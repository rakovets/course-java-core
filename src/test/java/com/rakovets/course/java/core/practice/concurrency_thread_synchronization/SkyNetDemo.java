package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Fraction;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.RoboParts;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Storage;

import java.util.LinkedList;
import java.util.List;

public class SkyNetDemo {
    public static void main(String[] args) {
        List<RoboParts> roboPartsList = new LinkedList<>();
        Storage storage = new Storage(roboPartsList, 200);

        Factory factory = new Factory(storage);
        Fraction human = new Fraction(storage);
        Fraction skyNet = new Fraction(storage);
        Thread producePatsFoRobo = new Thread(factory, "producePatsFoRobo");
        Thread humanFraction = new Thread(human, "humanFraction");
        Thread roboSkyNet = new Thread(skyNet, "roboSkyNet");

        producePatsFoRobo.start();
        humanFraction.start();
        roboSkyNet.start();

        try {
            humanFraction.join();
            roboSkyNet.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (human.getCountRobot() > skyNet.getCountRobot()) {
            System.out.println("human have more robots\nHumans robots " + human.getCountRobot() + "\n"
                    + "SkyNet robots " + skyNet.getCountRobot());
        } else if (human.getCountRobot() < skyNet.getCountRobot()) {
            System.out.println("SkyNet have more robots\nHumans robots " + human.getCountRobot() + "\n"
                    + "SkyNet robots " + skyNet.getCountRobot());
        } else {
            System.out.println("Draw robots\nHumans robots " + human.getCountRobot() + "\n"
                    + "SkyNet robots " + skyNet.getCountRobot());
        }
    }
}
