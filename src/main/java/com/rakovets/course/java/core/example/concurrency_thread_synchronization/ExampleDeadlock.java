package com.rakovets.course.java.core.example.concurrency_thread_synchronization;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.BankAccount;
import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.MoneyTransfer;

public class ExampleDeadlock {
    public static void main(String[] args) {
        BankAccount aliceAccount = new BankAccount("Jon Turing", 5000.0);
        BankAccount bobAccount = new BankAccount("Bill Lee", 10000.0);

        Runnable transaction1 = new MoneyTransfer(aliceAccount, bobAccount, 1200);
        Thread t1 = new Thread(transaction1);
        t1.start();

        Runnable transaction2 = new MoneyTransfer(bobAccount, aliceAccount, 700);
        Thread t2 = new Thread(transaction2);
        t2.start();
    }
}
