package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.Producer_Queue_Consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.Producer_Queue_Consumer.Container;
import com.rakovets.course.java.core.practice.concurrency.Producer_Queue_Consumer.Producer;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        Container container = new Container();
        String filePath = "/Users/nikita/IdeaProjects/course-java-core/src/main/resources/practice/ProdCon.txt";
        Thread producer = new Thread(new Producer(container), "Producer");
        Thread consumer1 = new Thread(new Consumer(container, filePath), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(container, filePath), "Consumer2");
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
