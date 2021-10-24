package com.rakovets.course.java.core.example.generics.bank;

public class LinuxBank {
    public static void main(String[] args) {
        Account<Long> rakovets = new Account<Long>(123L, "Dmitry Rakovets");
        System.out.println(rakovets);
    }
}
