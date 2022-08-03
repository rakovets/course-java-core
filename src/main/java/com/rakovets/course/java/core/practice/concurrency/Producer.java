package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Queue;

public class Producer extends Thread {
    private final Queue<Integer> queue;

    public Producer(Queue <Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        getInfoFromConsole();
    }

    public void getInfoFromConsole() {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String inputString = "";
        while (true) {
            try {
                System.out.print("Enter Integer Numbers: ");
                inputString = bufferRead.readLine();
                if (!inputString.matches("-?[\\d]+")) {
                    throw new UserInputException("Enter Integer Numbers!");
                }
                if (Objects.equals(inputString, "-1")) {
                    return;
                }
                queue.add(Integer.valueOf(inputString));
                System.out.println(queue);
            } catch (UserInputException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
