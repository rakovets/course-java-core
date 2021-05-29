package com.rakovets.course.java.core.practice.concurrent_utilities.master_workers;

import java.util.Deque;
import java.util.LinkedList;

public class SharedResource {
    public static Deque<Integer> listOfNumbers = new LinkedList<>();

    public void addNumberToList(int number) {
        listOfNumbers.add(number);
    }

    public void removeFirstElement() {
        listOfNumbers.removeFirst();
    }

    public int getElementFromList() {
        return listOfNumbers.element();
    }

    public boolean isEmpty() {
        return listOfNumbers.isEmpty();
    }

    public Deque<Integer> getListOfNumbers() {
        return listOfNumbers;
    }
}
