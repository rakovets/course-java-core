package com.rakovets.course.java.core.practice.jcf.set.Stack;

class StackDemo {
    public static void main (String[] args) {

        Stack<Integer> stack = new Stack<>(Integer[].class, 5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.show();

        stack.pop();
        stack.show();

        System.out.println("Stack size is:");
        System.out.println(stack.size());
        System.out.println("Stack capacity is:");
        System.out.println(stack.capacity());

        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");

        System.out.println("Clearing stack");
        stack.clear();
        stack.show();
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is: " + stack.peek());
    }
}
