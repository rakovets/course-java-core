package com.rakovets.course.java.core.practice.jcf.set;

import java.util.HashSet;
import java.util.Set;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> myStack = new java.util.Stack<>();
        myStack.add(15);
        myStack.remove(16);
        myStack.size();
        myStack.isEmpty();
        System.out.println(myStack.size());
    }
}
