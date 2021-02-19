package com.rakovets.course.java.core.practice.io.ComputerRepairWorkshop;

import java.io.Serializable;

public class Touchpad implements Serializable {
    String connectionType;
    String gestureSupport;

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
