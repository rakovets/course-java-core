package com.rakovets.course.java.core.practice.jcf.set;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(4);
        stack.putValue(2);
        stack.putValue(4);
        stack.putValue(6);
        stack.putValue(8);

        System.out.println(stack.viewLastElement());
        System.out.println(stack.toString());

    }
}
