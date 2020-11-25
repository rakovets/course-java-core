package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class SkyNetDemo {
    public static void main(String[] args) throws InterruptedException {
        final Fraction world = new World(); // экземпляр класс ворлд, типа фракшн, и не можем его переназначить.
        final Fraction wednesday = new Wednesday();
        final Factory factory = new Factory();

        Thread factoryThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    factory.produce(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        factoryThread.start();
        factoryThread.join();
        System.out.println(factory.getDetails().size());
    }
}
