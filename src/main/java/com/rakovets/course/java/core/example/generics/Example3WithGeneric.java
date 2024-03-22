package com.rakovets.course.java.core.example.generics;

import com.rakovets.course.java.core.example.generics.model.AccountWithGeneric;

public class Example3WithGeneric {
    public static void main(String[] args) {
        AccountWithGeneric<String> acc1 = new AccountWithGeneric<String>("11079c0a-1395-4074-9d4b-41c2733e85d2", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        AccountWithGeneric<Integer> acc2 = new AccountWithGeneric<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
