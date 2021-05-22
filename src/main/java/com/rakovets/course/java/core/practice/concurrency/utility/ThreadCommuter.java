package com.rakovets.course.java.core.practice.concurrency.utility;

import com.rakovets.course.java.core.practice.concurrency.queue.UserInputException;
import com.rakovets.course.java.core.util.AnsiColorCode;

import java.util.Scanner;

public class ThreadCommuter implements Runnable{
    private long minute;
    private Thread repeatSave;

    public ThreadCommuter(long minute, Thread repeatSave) {
        this.minute = minute;
        this.repeatSave = repeatSave;
    }

    @Override
    public void run() {
        String message = "";
        while (true) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_YELLOW_BOLD, "Autosave is performed every " + minute +
                    " minutes.", AnsiColorCode.RESET);
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_GREEN_BOLD, "To close the application, enter N/n",
                    AnsiColorCode.RESET);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value: ");
            try {
                message = scanner.nextLine();
                if (message.matches("[^Nn]")) {
                    throw new UserInputException(message);
                }
                     repeatSave.interrupt();
                    break;
              } catch (UserInputException ex) {
                System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD, ex.getMessage(), AnsiColorCode.RESET);
            }
            System.out.println("");
        }
    }
}
