package com.rakovets.course.java.core.practice.jcf.set;

public class StackDemo {
    public static <T> void main(String[] args) {
        Stack<Integer> myStack = new Stack<>(10, true);
        myStack.addToStack(10);
        myStack.addToStack(20);
        myStack.addToStack(30);
        myStack.addToStack(40);
        System.out.println(myStack);

        System.out.println(myStack.stackSize());

        System.out.println(myStack.isEmpty());

        myStack.clearStack();
        System.out.println(myStack);

        myStack.addToStack(10);
        myStack.addToStack(20);
        myStack.addToStack(30);
        myStack.addToStack(40);
        System.out.println(myStack.showLast());

        System.out.println(myStack.removeLast());
        System.out.println(myStack);
    }
}
