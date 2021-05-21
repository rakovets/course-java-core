package com.rakovets.course.java.core.practice.concurrency.queue;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.Queue;
import java.util.Scanner;

public class Producer implements Runnable {
    private Queue<Integer> queue;

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        String number = "";
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            try {
                number = scanner.nextLine();
                if (
                        number.matches("\\D") ||
                        number.matches("") ||
                        Double.parseDouble(number) % 1 != 0 ||
                        Integer.parseInt(number) < 0 && Integer.parseInt(number) != -1
                ) {
                    throw new UserInputException(number);
                }

                int i = Integer.parseInt(number);
                if (i == -1) {
                    Program.setIsInterrupt(true);
                    break;
                }
                queue.add(i);
            } catch (UserInputException ex) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, ex.getMessage(), AnsiColorCode.RESET);
            }
        }
    }
}
