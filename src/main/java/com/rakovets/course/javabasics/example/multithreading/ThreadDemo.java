package com.rakovets.course.javabasics.example.multithreading;

public class ThreadDemo {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getState());
        test();

        Thread redThread = new ColorThread(ThreadColor.ANSI_RED);
        redThread.setDaemon(true);
        redThread.start();

        Thread blueThread = new ColorThread(ThreadColor.ANSI_BLUE);
        blueThread.setDaemon(true);
        blueThread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("THE END");
    }

    public static void test() {
        System.out.println(Thread.currentThread().getStackTrace()[0]);
        System.out.println(Thread.currentThread().getStackTrace()[1]);
        System.out.println(Thread.currentThread().getStackTrace()[2]);
    }
}
