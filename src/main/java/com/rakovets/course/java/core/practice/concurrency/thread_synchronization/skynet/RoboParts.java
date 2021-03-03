package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.Collections;
import java.util.LinkedList;

public enum RoboParts {
    HEAD,
    TORSO,
    HAND,
    FEET;

    public static LinkedList<RoboParts> getModel() {
        LinkedList<RoboParts> model = new LinkedList<>();
        Collections.addAll(model, RoboParts.HAND, RoboParts.HAND, RoboParts.HEAD, RoboParts.FEET, RoboParts.FEET, RoboParts.TORSO);
        return model;
    }
}
