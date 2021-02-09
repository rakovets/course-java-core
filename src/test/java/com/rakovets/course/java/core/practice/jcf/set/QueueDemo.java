package com.rakovets.course.java.core.practice.jcf.set;

import com.rakovets.course.java.core.practice.jcf.set.queue.Queue;

import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        new Queue<String>(new Scanner(System.in), 5).start();
    }
}
