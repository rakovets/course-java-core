package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StackDemo {
    public static <T> void main(String[] args) {
        Stack<Integer> newStack = new Stack<>(10, true);

        newStack.addToStack(1);
        newStack.addToStack(2);
        newStack.addToStack(3);

        System.out.println(newStack);

        System.out.println(newStack.removeLast());
        System.out.println(newStack);

        System.out.println(newStack.stackSize());

        System.out.println(newStack.isEmpty());

        newStack.clearStack();
        System.out.println(newStack);

        newStack.addToStack(1);
        newStack.addToStack(2);
        newStack.addToStack(3);

        System.out.println(newStack.showLast());
    }
}
