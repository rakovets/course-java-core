package com.rakovets.course.java.core.practice.concurrency.utility;

import com.rakovets.course.java.core.practice.concurrency.queue.UserInputException;
import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.Scanner;

public class ThreadCommuter implements Runnable{
    long minute;

    public ThreadCommuter(long minute) {
        this.minute = minute;
    }

    @Override
    public void run() {
        String message = "";
        while (true) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_GREEN_BOLD, "Autosave is performed every " + minute +
                    " minutes.", AnsiColorCode.RESET);
            System.out.println("To close the application, enter N/n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value: ");
            try {
                message = scanner.nextLine();
                if (message.matches("[^Nn]")) {
                    throw new UserInputException(message);
                }
                BackupUtility.setIsAlive(false);
                break;
            } catch (UserInputException ex) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, ex.getMessage(), AnsiColorCode.RESET);
            }
            System.out.println("");
        }
    }
}
