package com.rakovets.java.practice.multithreading;

public class ColorThread extends Thread {
    private static int index = 0;
    private String color;

    public ColorThread(String color, String name) {
        super(name);
        this.color = color;
    }

    public ColorThread(String color) {
        this.color = color;
    }

    @Override
    public void run() {
        int red = 0;
        int blue = 0;
        while (index < 20) {
            System.out.println(this.color + "Run " + Thread.currentThread().getName() + " Thread...");
            if (this.color == ThreadColor.ANSI_RED) {
                red++;
                System.out.println(this.color + ++index);
            } else {
                blue++;
                System.out.println(this.color + ++index);

            }
            //            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
