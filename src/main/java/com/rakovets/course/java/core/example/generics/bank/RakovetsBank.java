package com.rakovets.course.java.core.example.generics.bank;

public class RakovetsBank {
    public static void main(String[] args) {
        Account<Integer> rakovets = new Account<Integer>(123, "Dmitry Rakovets");
        System.out.println(rakovets);
    }
}
