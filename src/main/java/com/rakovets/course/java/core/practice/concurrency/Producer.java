package com.rakovets.course.java.core.practice.concurrency;

import java.util.Queue;
import java.util.Scanner;

public class Producer implements Runnable{
    private Queue<Integer> commonResource;

    public Producer(Queue<Integer> commonResource) {
        this.commonResource = commonResource;
    }

    public void run ()  {
        Integer numberIntegerType;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please,enter your number, your number must be more then 0. If you want no end this program enter -1");
            try {
                int number = scanner.nextInt();
                Consumer.setStatus(false);
                if (number == -1) {

                    break;
                } else if (number < -1) {
                    throw new UserInputException("You entered the wrong value,please try again");
                } else {
                    numberIntegerType = number;
                    commonResource.add(numberIntegerType);
                    System.out.println(commonResource.peek());
                }
            } catch (NumberFormatException numberFormatException) {
                try {
                    throw new UserInputException("You entered the wrong value,please try again");
                } catch (UserInputException userInputException) {
                    System.out.println(userInputException.getMessage());
                }
            } catch (UserInputException userInputException) {
                System.out.println(userInputException.getMessage());
            }
        }
    }
}
