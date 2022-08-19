package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Fraction;

import java.util.Arrays;
import java.util.Iterator;

import static com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.Store.LOGGER;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory(5);
        Fraction fraction = new Fraction(factory, "V");
        Fraction fraction1 = new Fraction(factory, "W");

        Thread thread = new Thread(factory);
        Thread thread1 = new Thread(fraction);
        Thread thread2 = new Thread(fraction1);

        Arrays.asList(thread, thread1, thread2).forEach(Thread::start);

        for (Thread thread3 : Arrays.asList(thread, thread1, thread2)) {
            thread3.join();
        }

        System.out.println();
        Arrays.asList("Army size " + fraction.getArmy().size() + " " + fraction.getName(),
                "Army size " + fraction1.getArmy().size() + " " + fraction1.getName()).forEach(System.out::println);

        LOGGER.info("\nDetails fraction");
        Arrays.asList(fraction, fraction1).forEach(fraction2 -> fraction2.print(fraction.getFractionDetail()));

        if (fraction.getArmy().size() > fraction1.getArmy().size()) {
            System.out.println(fraction.getName() + " Winner " + fraction.getArmy().size());
        } else if (fraction.getArmy().size() == fraction1.getArmy().size()) {
            System.out.println("No winner!");
        } else {
            System.out.println(fraction1.getName() + " Winner " + fraction1.getArmy().size());
        }
    }
}

