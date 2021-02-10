package com.rakovets.course.java.core.practice.jcf.set.PriorityQueue;

public class PriorityQueueDemo {
    public static void main (String[] args) {

        PriorityQueue<Character> pq = new PriorityQueue<>(Character[].class, 5);

        pq.insertWithPriority('a');
        System.out.println("Front element is: " + pq.peek());

        pq.insertWithPriority('b');
        System.out.println("Front element is: " + pq.peek());
        System.out.println("Queue elements in order of priority: ");
        pq.show();

        pq.insertWithPriority('c');
        System.out.println("Front element is: " + pq.peek());
        System.out.println("Queue elements in order of priority: ");
        pq.show();

        pq.pullHighestPriorityElement();
        System.out.println("Front element is: " + pq.peek());

        if (pq.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}
