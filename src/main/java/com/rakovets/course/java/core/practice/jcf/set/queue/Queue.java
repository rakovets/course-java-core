package com.rakovets.course.java.core.practice.jcf.set.queue;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Queue<N> {
    private int length = 10;
    private final Set<N> queue = new LinkedHashSet<>(length);
    private final Scanner scanner;

    public Queue(Scanner scanner, int length) {
        this.scanner = scanner;
        if (length > 0) {
            this.length = length;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.size() == length;
    }

    public void enqueue(N member) {
        if (queue.size() < length) {
            queue.add(member);
        }
    }

    public N dequeue() {
        Iterator<N> iter = queue.iterator();
        N result = iter.next();
        iter.remove();
        return result;
    }

    public void show() {
        System.out.println(queue);
    }

    @Override
    public String toString() {
        return "Queue: " + queue;
    }

    private void printMenu() {
        System.out.println("1. Check queue for emptiness;");
        System.out.println("2. Check queue for filling;");
        System.out.println("3. Add item to queue;");
        System.out.println("4. Remove item from queue;");
        System.out.println("5. Display the queue;");
        System.out.println("6. Exit the menu;");
    }

    public void start() {
        if (this.scanner != null) {
            try {
                int key;

                do {
                    printMenu();
                    System.out.print("Enter menu number: ");
                    key = this.scanner.nextInt();
                    switch (key) {
                        case 1:
                            System.out.println(isEmpty());
                            break;
                        case 2:
                            System.out.println(isFull());
                            break;
                        case 3:
                            String member;
                            System.out.print("Enter your value: ");
                            Scanner enter = new Scanner(System.in);
                            member = enter.nextLine();
                            try {
                                enqueue((N) member);
                            } catch (Exception exp) {
                                System.out.println("Illegal member for queue");
                            }
                            break;
                        case 4:
                            if (isEmpty()) {
                                System.out.println("Impossible operation - Queue is empty");
                            } else {
                                System.out.println("Removed from queue: " + dequeue());
                            }
                            break;
                        case 5:
                            show();
                            break;
                        case 6:
                            System.out.println("Closing the application");
                            break;
                        default:
                            System.out.println("You entered an invalid menu value\n");
                    }
                } while (key != 6);

            } catch (Exception exp) {
                System.out.println("Entered value is not number!");
            }
        }
    }

    public int getLength() {
        return length;
    }

    public Set<N> getQueue() {
        return queue;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
