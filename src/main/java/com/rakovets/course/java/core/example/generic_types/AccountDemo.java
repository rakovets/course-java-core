package com.rakovets.course.java.core.example.generic_types;

import com.rakovets.course.java.core.example.generic_types.model.Account;

public class AccountDemo {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
