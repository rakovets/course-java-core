package com.rakovets.course.java.core.practice.jcf.set;

public class Stack {
    private java.util.Stack<Integer> stack;

    public Stack(java.util.Stack<Integer> stack) {
        this.stack = stack;
    }

    public void putInStack(Integer number) {
        stack.push(number);
    }

    public void getFromStack() {
        if (stack.empty()) {
            stack.pop();
        }
    }
}
