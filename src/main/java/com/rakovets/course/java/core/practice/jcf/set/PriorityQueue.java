package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PriorityQueue<T> {
    private int capacity = 10;
    HashSet<T> priorityQueue = new LinkedHashSet<>();

    public PriorityQueue(int totalCapacity) {
        if (totalCapacity > 0) {
            this.capacity = totalCapacity;
        }
    }

    public boolean isEmpty() {
       return priorityQueue.isEmpty();
    }

    public boolean isFull() {
        return priorityQueue.size() == capacity;
    }

    public void enqueue(T x) {
        if (priorityQueue.size() < capacity) {
            priorityQueue.add(x);
        }
    }

    public T dequeue() {
        Iterator<T> iter = priorityQueue.iterator();
        T element = null;

        element = iter.next();

        iter.remove();

        return element;
    }

    public HashSet<T> show() {
        return priorityQueue;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "priorityQueue=" + priorityQueue +
                '}';
    }

    public void getMenu() {
        boolean isQuit = false;
        do {
            Scanner scan = new Scanner(System.in);

            String menu = "Menu\n" + "1 - Is the list empty?\n" + "2 - Is the list full?\n" + "3 - Add element to the list\n"
                + "4 - Remove element from list\n" + "5 - Show all elements\n" + "6 - Quit\n";

            System.out.println(menu);

            byte function = scan.nextByte();

            switch (function) {
                case 1:
                    System.out.println(isEmpty());
                    break;
                case 2:
                    System.out.println(isFull());
                    break;
                case 3:
                    String element;
                    System.out.println("Enter your value");
                    Scanner scan2 = new Scanner(System.in);
                    element = scan2.nextLine();
                    try {
                        enqueue((T) element);
                        break;
                    } catch (Exception e) {
                        System.out.println("Incorrect value");
                    }
                case 4:
                    try {
                        System.out.println(dequeue());
                        break;
                    } catch (Exception e) {
                        System.out.println("List is empty! Nothing to delete!");
                    }
                case 5:
                    try {
                        System.out.println(priorityQueue);
                        break;
                    } catch (Exception ex) {
                        System.out.println("List is empty! Nothing to show!");
                    }
                case 6:
                    isQuit = true;
                    System.out.println("Application is closing");
                    break;
                default:
                    System.out.println("No such menu");
                    break;
            }
        } while (!isQuit);
    }
}
