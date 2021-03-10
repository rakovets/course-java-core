package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.Collections;
import java.util.LinkedList;

public enum RoboPart {
    HEAD,
    TORSO,
    HAND,
    FEET;

    public static LinkedList<RoboPart> getModel() {
        LinkedList<RoboPart> model = new LinkedList<>();
        Collections.addAll(model, RoboPart.HAND, RoboPart.HAND, RoboPart.HEAD, RoboPart.FEET, RoboPart.FEET, RoboPart.TORSO);
        return model;
    }
}
