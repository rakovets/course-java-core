package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class FactoryAction extends Thread{
    private Factory factory;

    public FactoryAction(String name, Factory factory){
        super(name);
        this.factory = factory;
    }

    @Override
    public void run() {
        while (factory.getDays() > 0) {
            factory.put();
        }
    }


}
