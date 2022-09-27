package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Client {
    protected static int amount;

    Client(int amount) {
        Client.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
