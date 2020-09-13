package com.rakovets.java.practice.generics;

import com.rakovets.java.practice.generics.model.LongBankAccount;
import com.rakovets.java.practice.generics.model.StringBankAccount;
import com.rakovets.java.practice.generics.model.Transaction;

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
