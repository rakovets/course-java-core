package com.rakovets.course.java.core.example.generics;

import com.rakovets.course.java.core.example.generics.model.DepositAccount;

public class Example4WithInheritance {
    public static void main(String[] args) {
        DepositAccount<Integer> depAccount = new DepositAccount(1984);
//        Account<String> account = (Account<String>) depAccount;
    }
}
