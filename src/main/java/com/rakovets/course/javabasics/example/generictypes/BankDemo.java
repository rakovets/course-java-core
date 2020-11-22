package com.rakovets.course.javabasics.example.generictypes;

import com.rakovets.course.javabasics.example.generictypes.model.LongBankAccount;
import com.rakovets.course.javabasics.example.generictypes.model.StringBankAccount;
import com.rakovets.course.javabasics.example.generictypes.model.Transaction;

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
