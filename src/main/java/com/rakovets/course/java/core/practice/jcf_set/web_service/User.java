package com.rakovets.course.java.core.practice.jcf_set.web_service;

public class User {
    private String name;
    private int priority;

    public User(String name, int priority) {
        this.name = name;
        this.priority= priority;
    }

    @Override
    public String toString() {
        return this.name + " queue priority " + Integer.toString(priority);
    }

    public int getPriority() {
        return priority;
    }
}
