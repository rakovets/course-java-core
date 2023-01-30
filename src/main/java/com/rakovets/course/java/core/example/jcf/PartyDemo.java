package com.rakovets.course.java.core.example.jcf;

import com.rakovets.course.java.core.example.jcf.model.Student;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PartyDemo {
    public static void main(String[] args) {
        Collection<Student> party = List.of(new Student("Semion"),
                new Student("Nikita"),
                new Student("Alexei"),
                new Student("Tatiana"),
                new Student("Jon", 200),
                new Student("Jon", 100));

        PriorityQueue<Student> partyPriorityQueue = new PriorityQueue<>(party);
        ArrayDeque<Student> partyArrayQueue = new ArrayDeque<>();

        LinkedList<Student> partyLinkedList = new LinkedList<>(party);
        printQueue(partyLinkedList);

        System.out.println("The owner here!");
        partyLinkedList.poll();
        printQueue(partyLinkedList);

        System.out.println("The owner here!");
        partyLinkedList.remove();
        printQueue(partyLinkedList);

        System.out.println("The owner's mom here!");
        System.out.println(partyLinkedList.element());
        printQueue(partyLinkedList);

        System.out.println("The owner's mom here!");
        System.out.println(partyLinkedList.peek());
        printQueue(partyLinkedList);

        partyLinkedList.add(new Student("Bob"));
        printQueue(partyLinkedList);
        partyLinkedList.offer(new Student("Marley"));
        printQueue(partyLinkedList);

        System.out.println("The owner here!");
        partyLinkedList.removeLast();
        printQueue(partyLinkedList);

        System.out.println("The owner here!");
        partyLinkedList.remove(1);
        printQueue(partyLinkedList);

        //PriorityQueue
        partyPriorityQueue.add(new Student("Jon", 200));
        partyPriorityQueue.add(new Student("Jon", 100));
        printQueue(partyPriorityQueue);
    }

    static <T> void printQueue(Queue<T> queue) {
        System.out.println("Queue -> ");
        for (T t : queue) {
            System.out.println(t);
        }
    }
}
