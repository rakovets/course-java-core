package com.rakovets.course.java.core.example.generics;

import com.rakovets.course.java.core.example.generics.model.AccountWithoutGeneric;

public class Example2WithoutGeneric {
    public static void main(String[] args) {
        AccountWithoutGeneric acc1 = new AccountWithoutGeneric("11079c0a-1395-4074-9d4b-41c2733e85d2", 5000);
        int acc1Id = (int) acc1.getId(); // error
        System.out.println(acc1Id);
    }
}
