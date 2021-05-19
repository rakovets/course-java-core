package com.rakovets.course.java.core.practice.concurrency.threads;

import com.rakovets.course.java.core.practice.concurrency.UserInputExeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Producer implements Runnable{
    private final Scanner scanner = new Scanner(System.in);


    @Override
    public void run() {
        System.out.println("Start work");
        while (true){
            try {
                int inputNumber = scanner.nextInt();
                if (inputNumber == - 1){
                    System.out.println("End work");
                    Store.list.offer(inputNumber);
                    break;
                }
                Store.list.offer(inputNumber);
            }
            catch (InputMismatchException e){
                throw new UserInputExeption("Bce x$#H9 MuIIIa, DaBai no HoBoi");
            }
        }
    }
}
