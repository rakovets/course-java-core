package com.rakovets.course.java.core.practice.concurrency;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        String path = "D:\\JAVA\\dev\\first program\\course-java-core\\src\\test\\resources\\test.txt";

        FileHelper fileHelper = new FileHelper();
        fileHelper.setFilename(path);

        QueueContainer queueContainer = new QueueContainer();

        Thread producer = new Thread(new Producer(queueContainer));
        Thread consumer1 = new Thread(new Consumer(queueContainer, fileHelper));
        Thread consumer2 = new Thread(new Consumer(queueContainer, fileHelper));
        Thread consumer3 = new Thread(new Consumer(queueContainer, fileHelper));

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

        producer.join();
        consumer1.join();
        consumer2.join();
        consumer3.start();
    }
}
