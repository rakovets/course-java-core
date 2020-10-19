package com.rakovets.course.javabasics.example.generics;

import com.rakovets.course.javabasics.example.generics.model.LongBankAccount;
import com.rakovets.course.javabasics.example.generics.model.StringBankAccount;
import com.rakovets.course.javabasics.example.generics.model.Transaction;

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
