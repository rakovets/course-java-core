package com.rakovets.course.java.core.example.generics;

import com.rakovets.course.java.core.example.generics.model.AccountWithoutGeneric;

public class Example1WithoutGeneric {
    public static void main(String[] args) {
        AccountWithoutGeneric acc1 = new AccountWithoutGeneric(2334, 5000); // id - число
        int acc1Id = (int) acc1.getId();
        System.out.println(acc1Id);

        AccountWithoutGeneric acc2 = new AccountWithoutGeneric("11079c0a-1395-4074-9d4b-41c2733e85d2", 5000); // id - строка
        System.out.println(acc2.getId());
    }
}
