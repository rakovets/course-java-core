package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

import java.util.ArrayDeque;
import java.util.Queue;

public class CommonResource {
    Queue<Integer> queue = new ArrayDeque<>();
}
