package com.rakovets.course.javabasics.example.exceptionhandling;

import com.rakovets.course.javabasics.example.exceptionhandling.exception.AccountExpiredException;
import com.rakovets.course.javabasics.example.exceptionhandling.model.Account;

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
