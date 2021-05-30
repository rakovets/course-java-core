package com.rakovets.course.java.core.practice.concurrent_utilities.producer_cosumer;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Producer extends Thread {
    private static ConcurrentLinkedQueue<Integer> terminalCollector = new ConcurrentLinkedQueue<>();

    public Producer(ConcurrentLinkedQueue<Integer> terminalCollector) {
        Producer.terminalCollector = terminalCollector;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String container = "";
        while (true) {
            try {
                container = scanner.nextLine();
                if (Integer.parseInt(container) < -1) {
                    throw new UserInputException("Wrong input try again");
                } else {
                    terminalCollector.offer(Integer.parseInt(container));
                    if (container.equals("-1")) {
                        break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                try {
                    throw new UserInputException("Wrong input try again");
                } catch (UserInputException userInputException) {
                    System.out.println(userInputException.getMessage());
                }
            } catch (UserInputException userInputException) {
                System.out.println(userInputException.getMessage());
            }
        }
    }
}
