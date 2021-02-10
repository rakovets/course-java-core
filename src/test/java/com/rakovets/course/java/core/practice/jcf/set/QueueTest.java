package com.rakovets.course.java.core.practice.jcf.set;

import com.rakovets.course.java.core.practice.jcf.set.queue.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class QueueTest {

    @Test
    void isEmpty() {
        // GIVEN
        Queue<String> example = new Queue<>(new Scanner(System.in), 5);

        // WHEN
        boolean actualBoolean = example.isEmpty();

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void isFullFalse() {
        // GIVEN
        Queue<String> example = new Queue<>(new Scanner(System.in), 5);
        example.enqueue("Alex");
        example.enqueue("Deborah");

        // WHEN
        boolean actualBoolean = example.isFull();

        // THEN
        Assertions.assertFalse(actualBoolean);
    }

    @Test
    void isFullTrue() {
        // GIVEN
        Queue<String> example = new Queue<>(new Scanner(System.in), 4);
        example.enqueue("Alex");
        example.enqueue("Deborah");
        example.enqueue("Sam");
        example.enqueue("Max");

        // WHEN
        boolean actualBoolean = example.isFull();

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void enqueue() {
        // GIVEN
        Queue<String> example = new Queue<>(new Scanner(System.in), 4);
        example.enqueue("Alex");

        // WHEN
        boolean actualBoolean = example.isEmpty();
        String actualString = example.toString();

        // THEN
        Assertions.assertFalse(actualBoolean);
        Assertions.assertEquals("Queue: [Alex]", actualString);
    }

    @Test
    void dequeue() {
        // GIVEN
        Queue<String> example = new Queue<>(new Scanner(System.in), 4);
        example.enqueue("Alex");
        example.enqueue("Deborah");
        example.enqueue("Sam");
        example.enqueue("Max");

        // WHEN
        String actualString = example.dequeue();

        // THEN
        Assertions.assertEquals("Alex", actualString);
    }
}
