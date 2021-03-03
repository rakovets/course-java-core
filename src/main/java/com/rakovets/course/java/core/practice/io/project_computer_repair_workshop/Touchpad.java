package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private String size;
    private boolean isMultitouch;

    public Touchpad(String size, boolean isMultitouch) {
        this.size = size;
        this.isMultitouch = isMultitouch;
    }

    public String getSize() {
        return size;
    }

    public boolean isMultitouch() {
        return isMultitouch;
    }

    @Override
    public String toString() {
        return "Touchpad{" +
                "size='" + size + '\'' +
                ", isMultitouch=" + isMultitouch +
                '}';
    }
}
