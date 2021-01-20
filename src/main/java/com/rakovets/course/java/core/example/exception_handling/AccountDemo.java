package com.rakovets.course.java.core.example.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.AccountExpiredException;
import com.rakovets.course.java.core.example.exception_handling.model.Account;

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            System.out.println("Client -> ATM: Give me my money!");
            account.takeCash(100);
            System.out.println("ATM -> Client: Take your money!");
        } catch (AccountExpiredException e) {
            System.out.println("ATM -> Client: " + e.getMessage());
            System.out.println("Program -> log file: " + e.getDebugMessage());
        }
    }
}
