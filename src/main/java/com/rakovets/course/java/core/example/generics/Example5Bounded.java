package com.rakovets.course.java.core.example.generics;

import com.rakovets.course.java.core.example.generics.model.AccountWithGeneric;
import com.rakovets.course.java.core.example.generics.model.Transaction;

public class Example5Bounded {
    public static void main(String[] args) {
        AccountWithGeneric acc1 = new AccountWithGeneric("9f5bd57d-e0d6-4e4c-8673-c79b5b7e03e4", 4500);
        AccountWithGeneric acc2 = new AccountWithGeneric("6077f64b-ab62-4584-8c34-fba3926a50ee", 1500);

        Transaction<AccountWithGeneric> tran1 = new Transaction<AccountWithGeneric>(acc1, acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<AccountWithGeneric>(acc1, acc2, 4000);
        tran1.execute();
    }
}
