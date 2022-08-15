package com.rakovets.course.java.core.practice.concurrency;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Producer implements Runnable {
    public static final Logger LOGGER = Logger.getLogger(Producer.class.getName());
    private static final Scanner SCANNER = new Scanner(System.in);
    private final Queue<Integer> queue;

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }

    /**
     * The Producer thread endlessly reads the integers that the user enters into the Standard Input.
     * <p /> The Producer thread stores integers in a Queue.
     * <p /> Entering -1 will terminate the Producer thread.
     * <p /> When the user enters invalid data, the Producer thread throws a UserInputException but continues to run.
     */
    @Override
    public void run() {
        while (true) {
            String nextLine = SCANNER.nextLine();
            try {
                if ("-1".equals(nextLine)) {
                    queue.add(Integer.valueOf(nextLine));
                    break;
                } else if (!(isNumeric(nextLine))) {
                    LOGGER.info(("Invalid line."));
                } else {
                    queue.add(Integer.valueOf(nextLine));
                }
            } catch (NumberFormatException exception) {
                LOGGER.info(exception.getMessage());
            }
        }
    }

    /**
     * Checks a string for valid input.
     *
     * @param str received string.
     * @return false - string is not a number, true - string is a number.
     */
    public boolean isNumeric(String str) {
        return str != null && !str.isEmpty()
                && IntStream.range(0, str.length()).allMatch(i -> Character.isDigit(str.charAt(i)));
    }
}
