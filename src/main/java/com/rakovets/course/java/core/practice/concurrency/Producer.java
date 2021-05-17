package com.rakovets.course.java.core.practice.concurrency;

import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Producer extends Thread {
    private Deque<Integer> terminalCollector;

    public Producer(Deque<Integer> terminalCollector) {
        this.terminalCollector = terminalCollector;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String container = "";
        while (true) {
            try {
                container = scanner.nextLine();
                if (container.equals("-1")) {
                    break;
                } else if (Integer.parseInt(container) < -1) {
                    throw new UserInputException("Wrong input try again");
                } else {
                    terminalCollector.offer(Integer.parseInt(container));
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
