package com.rakovets.java.practice.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Fold13"));
        PrintWriter pw = new PrintWriter(new File("Fold_13_macher"));

        String[] student;

        while (sc.hasNextLine()) {
            student = sc.nextLine().split("\\s+");
            double sum = 0;
            for (int i = 1; i < student.length; i++) {
                sum += Integer.parseInt(student[i]);
            }
            if (sum / (student.length - 1) > 7) {
                pw.println(student[0].toUpperCase());
            }
        }

        sc.close();
        pw.close();

    }
}

