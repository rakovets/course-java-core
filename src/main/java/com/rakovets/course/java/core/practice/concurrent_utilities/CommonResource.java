package com.rakovets.course.java.core.practice.concurrent_utilities;
import java.util.Deque;
import java.util.LinkedList;


public class CommonResource {
    private static Deque<Integer> numberCommonResource = new LinkedList<>();
    private static boolean status = true;

    public static Deque<Integer> getNumberCommonResource() {
        return numberCommonResource;
    }

    public static boolean addNumber(int number) {
        return numberCommonResource.add(number);
    }

    public void removeFirstElement() {
        numberCommonResource.removeFirst();
    }

    public int getElementFromCommonResource() {
        return numberCommonResource.element();
    }

    public boolean isEmptyCommonResource() {
        return numberCommonResource.isEmpty();
    }

    public static void setStatus() {
        status = false;
    }

    public static boolean isStatus() {
        return status;
    }
}
