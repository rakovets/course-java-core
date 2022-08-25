package com.rakovets.course.java.core.practice.concurrent_utilities;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Thread producer=new Thread(new Producer(),"Producer");
        Thread consumer1=new Thread(new Consumer(),"Consumer1");
        Thread consumer2=new Thread(new Consumer(),"Consumer2");
        consumer1.start();
        consumer2.start();
        producer.start();
    }
}

