package com.rakovets.course.java.core.practice.jcf.set;

import com.rakovets.course.java.core.practice.jcf.set.stack.StackProject;

public class StackProjectDemo {
    public static void main(String[] args) {
        StackProject<Integer> test = new StackProject<>(4, true);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);
        test.addToStack(354);
        test.addToStack(450);
        test.addToStack(35554);
        System.out.println("fixed for 4 members: " + test);

        System.out.println(test.peekLast());

        System.out.println(test.getCountOfMembers());

        System.out.println(test.isEmpty());
        System.out.println(test.isStackFull());

        test.clearStack();

        test.addToStack(450);
        System.out.println(test);

        Number poll = test.pollLast();
        System.out.println(poll);
        System.out.println(test);
    }
}
