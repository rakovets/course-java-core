package com.rakovets.course.java.core.practice.jcf.set;

import com.rakovets.course.java.core.practice.jcf.set.stack.StackProject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackProjectTest {
    @Test
    void addToStackFixed() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, true);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        String actualString = test.toString();

        // THEN
        Assertions.assertEquals("Stack: [1, 35]", actualString);
    }

    @Test
    void addToStackNotFixed() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, false);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        String actualString = test.toString();

        // THEN
        Assertions.assertEquals("Stack: [1, 35, 45]", actualString);
    }

    @Test
    void peekLast() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, false);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        int actualInt = test.peekLast();
        String actualString = test.toString();

        // THEN
        Assertions.assertEquals(45, actualInt);
        Assertions.assertEquals("Stack: [1, 35, 45]", actualString);
    }

    @Test
    void getCountOfMembers() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, false);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        int actualInt = test.getCountOfMembers();

        // THEN
        Assertions.assertEquals(3, actualInt);
    }

    @Test
    void isEmptyFalse() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, false);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        boolean actualBoolean = test.isEmpty();

        // THEN
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void isEmptyTrue() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, false);

        // WHEN
        boolean actualBoolean = test.isEmpty();

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void isStackFullUnfixed() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, false);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        boolean actualBoolean = test.isStackFull();

        // THEN
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void isStackFullFixedTrue() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, true);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        boolean actualBoolean = test.isStackFull();

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void isStackFullFixedFalse() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(4, true);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        boolean actualBoolean = test.isStackFull();

        // THEN
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void clearStack() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(4, true);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        test.clearStack();
        boolean actualBoolean = test.isEmpty();

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void pollLast() {
        // GIVEN
        StackProject<Integer> test = new StackProject<>(2, false);
        test.addToStack(1);
        test.addToStack(35);
        test.addToStack(45);

        // WHEN
        int actualInt = test.pollLast();
        String actualString = test.toString();

        // THEN
        Assertions.assertEquals(45, actualInt);
        Assertions.assertEquals("Stack: [1, 35]", actualString);
    }
}
