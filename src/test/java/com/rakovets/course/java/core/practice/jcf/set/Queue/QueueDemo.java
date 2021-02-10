package com.rakovets.course.java.core.practice.jcf.set.Queue;

import java.util.Scanner;

public class QueueDemo {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        Queue<Character> q = new Queue<>(Character[].class, 5);

        System.out.println("\nChoose operation:");
        char ch;

        do {
            System.out.println("1. Check if Queue is Empty");
            System.out.println("2. Check if Queue is Full");
            System.out.println("3. Add element to the Queue");
            System.out.println("4. Remove element from the Queue");
            System.out.println("5. Show all elements of the Queue");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Empty status = " + q.isEmpty());
                    break;
                case 2:
                    System.out.println("Full status = " + q.isFull());
                    break;
                case 3:
                    System.out.println("Insert element to add to the Queue");
                    q.enqueue(scan.next().charAt(0));
                    break;
                case 4:
                    System.out.println("Insert element to remove from the Queue");
                    q.dequeue(scan.next().charAt(0));
                    break;
                default:
                    System.out.println("Elements of the Queue:");
                    q.show();
                    break;
            }
            System.out.println("\nDo you want to continue (Type y or n)");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y'|| ch == 'y');
    }
}
