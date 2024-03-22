package com.rakovets.course.java.core.example.generics;

import com.rakovets.course.java.core.example.generics.model.AccountWithGeneric;
import com.rakovets.course.java.core.example.generics.model.Transaction;

public class Example6Bounded {
    public static void main(String[] args) {
        AccountWithGeneric<Integer> acc1 = new AccountWithGeneric<Integer>(1984, 4500);
        AccountWithGeneric<Integer> acc2 = new AccountWithGeneric<Integer>(2020, 1500);

        Transaction<AccountWithGeneric<Integer>> tran1 = new Transaction<AccountWithGeneric<Integer>>(acc1, acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<AccountWithGeneric<Integer>>(acc1, acc2, 4000);
        tran1.execute();
    }
}
