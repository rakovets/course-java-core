package com.rakovets.course.java.core.example.generic_types;

import com.rakovets.course.java.core.example.generic_types.model.LongBankAccount;
import com.rakovets.course.java.core.example.generic_types.model.Transaction;
import com.rakovets.course.java.core.example.generic_types.model.StringBankAccount;

public class BankDemo {
    public static void main(String[] args) {
        LongBankAccount tom = new LongBankAccount("Tom", "Pit");
        StringBankAccount jon = new StringBankAccount("Jon", "Snow");
        tom.setId(123);
        jon.setId("235dfgdfhd");
        boolean b = Transaction.executeTransaction(tom, jon, 100);
        System.out.println(b);
    }
}
