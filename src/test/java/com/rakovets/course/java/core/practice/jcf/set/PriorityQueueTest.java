package com.rakovets.course.java.core.practice.jcf.set;

import com.rakovets.course.java.core.practice.jcf.set.priority_queue.PriorityQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriorityQueueTest {

    @Test
    void isEmpty() {
        // GIVEN
        PriorityQueue<String> example = new PriorityQueue<>(5);

        // WHEN
        boolean actualBoolean = example.isEmpty();

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void isFullFalse() {
        // GIVEN
        PriorityQueue<String> example = new PriorityQueue<>(5);
        example.insertWithPriority("Alex", 3);
        example.insertWithPriority("Deborah", 3);

        // WHEN
        boolean actualBoolean = example.isFull();

        // THEN
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void isFullTrue() {
        // GIVEN
        PriorityQueue<String> example = new PriorityQueue<>(4);
        example.insertWithPriority("Alex", 3);
        example.insertWithPriority("Deborah", 3);
        example.insertWithPriority("Sam", 2);
        example.insertWithPriority("Max", 1);

        // WHEN
        boolean actualBoolean = example.isFull();

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void insertWithPriority() {
        // GIVEN
        PriorityQueue<String> example = new PriorityQueue<>(4);
        example.insertWithPriority("Alex", 3);

        // WHEN
        boolean actualBoolean = example.isEmpty();
        String actualString = example.toString();

        // THEN
        Assertions.assertFalse(actualBoolean);
        Assertions.assertEquals("[{Alex, priority = 3}]", actualString);
    }

    @Test
    void insertWithPriorityQueueMember() {
        // GIVEN
        PriorityQueue<String> example = new PriorityQueue<>(4);
        PriorityQueue.QueueMember<String> alex = new PriorityQueue.QueueMember<>("Alex", 3);
        example.insertWithPriority(alex);

        // WHEN
        boolean actualBoolean = example.isEmpty();
        String actualString = example.toString();

        // THEN
        Assertions.assertFalse(actualBoolean);
        Assertions.assertEquals("[{Alex, priority = 3}]", actualString);
    }

    @Test
    void pullHighestPriorityElement() {
        // GIVEN
        PriorityQueue<String> example = new PriorityQueue<>(4);
        example.insertWithPriority("Alex", 4);
        example.insertWithPriority("Deborah", 3);
        example.insertWithPriority("Sam", 2);
        example.insertWithPriority("Max", 1);

        // WHEN
        String actualString = example.pullHighestPriorityElement();
        boolean actualBoolean = example.isFull();

        // THEN
        Assertions.assertEquals("Alex", actualString);
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void peek() {
        // GIVEN
        PriorityQueue<String> example = new PriorityQueue<>(4);
        example.insertWithPriority("Alex", 4);
        example.insertWithPriority("Deborah", 3);
        example.insertWithPriority("Sam", 2);
        example.insertWithPriority("Max", 1);

        // WHEN
        String actualString = example.peek();
        boolean actualBoolean = example.isFull();

        // THEN
        Assertions.assertEquals("Alex", actualString);
        Assertions.assertTrue(actualBoolean);
    }
}
