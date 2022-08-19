package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Fraction;

import static com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.Store.LOGGER;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory(5);
        Fraction fraction = new Fraction(factory, "V");
        Fraction fraction1 = new Fraction(factory, "W");

        Thread thread = new Thread(factory);
        Thread thread1 = new Thread(fraction);
        Thread thread2 = new Thread(fraction1);

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();

        System.out.println();
        System.out.println("Army size " + fraction.getArmy().size() + " " + fraction.getName());
        System.out.println("Army size " + fraction1.getArmy().size() + " " + fraction1.getName());

        LOGGER.info("\nDetails fraction");
        fraction.print(fraction.getFractionDetail());
        fraction1.print(fraction.getFractionDetail());

        if (fraction.getArmy().size() > fraction1.getArmy().size()) {
            System.out.println(fraction.getName() + " Winner " + fraction.getArmy().size());
        } else if (fraction.getArmy().size() == fraction1.getArmy().size()) {
            System.out.println("No winner!");
        } else {
            System.out.println(fraction1.getName() + " Winner " + fraction1.getArmy().size());
        }
    }
}

