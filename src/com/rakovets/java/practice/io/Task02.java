package com.rakovets.java.practice.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Task02 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("Fold2.txt.txt")) {
            System.out.printf("File size: %d bytes \n", fin.available());
            int fi = -1;
            String fileContent = "";
            while ((fi = fin.read()) != -1) {
                fileContent += (char) fi;
            }
            System.out.println(fileContent);

            String[] words = fileContent.split(" ");
            int lenght = words.length;

            for (int i = 0; i < lenght; i++) {
                if ("aeuioe".contains("" + words[i].charAt(0))) {
                    System.out.println(words[i]);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
