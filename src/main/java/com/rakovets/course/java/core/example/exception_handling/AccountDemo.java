package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.AccountException;
import com.rakovets.course.java.core.example.exception_handling.model.Account;

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account(0.0, false);
        try {
            System.out.println("Client -> ATM: Give me my money!");
            int cash = account.takeCash(100);
            System.out.printf("ATM -> Client: Take your money! %s$", cash);
        } catch (AccountException e) {
            System.out.println("ATM -> Client: " + e.getMessage());
            System.out.println("Program -> log file: " + e.getDebugMessage());
        }
    }
}
