package com.rakovets.course.java.core.practice.jcf.set;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.pushInt(1);
        stack.pushInt(2);
        stack.pushInt(3);
        stack.pushInt(4);
        stack.pushInt(5);
        stack.pushInt(6);

        System.out.println("PushInt: " + stack);

        stack.popInt();
        System.out.println("PopInt: " + stack);

        System.out.println("Count: " + stack.countInt());

        System.out.println("Is empty: " + stack.isEmpty());

        System.out.println("Is full: " + stack.isFull());

        System.out.println(stack.getLastValue());

        System.out.println(stack.clearStack());

        System.out.println("Is empty: " + stack.isEmpty());
    }
}
