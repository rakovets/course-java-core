package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet.Fraction;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory(15);
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
        System.out.println(fraction.getArmy().size() + " " + fraction.getName());
        System.out.println(fraction1.getArmy().size() + " " + fraction1.getName());
        System.out.println(fraction.getArmy().size() > fraction1.getArmy().size()
                ? fraction.getName() + " Winner " + fraction.getArmy().size()
                : fraction1.getName() + " Winner " + fraction1.getArmy().size());
    }
}

