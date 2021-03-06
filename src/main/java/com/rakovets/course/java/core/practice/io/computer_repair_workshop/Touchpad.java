package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private final String connectionType;
    private final String gestureSupport;

    public Touchpad(String connectionType, String gestureSupport) {
        this.connectionType = connectionType;
        this.gestureSupport = gestureSupport;
    }

    @Override
    public String toString() {
        return "Touchpad{" +
                "connectionType='" + connectionType + '\'' +
                ", gestureSupport='" + gestureSupport + '\'' +
                '}';
    }
}
