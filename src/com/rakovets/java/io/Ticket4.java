package com.rakovets.java.io;

import java.io.*;

public class Ticket4 {
    public static void main(String[] args) {
        try(BufferedReader inputStream = new BufferedReader(new FileReader("Ticket4.txt"))) {
            String text;
            while ((text = inputStream.readLine()) != null) {
                String[] values = text.split("[a-zA-Z \\.\\,\\;]+\\s*");
                String maxLengthOfValue = values[0];
                for (int j = 1; j < values.length; j++) {
                    if (maxLengthOfValue.length() < values[j].length()) {
                        maxLengthOfValue = values[j];
                    }
                }
                System.out.printf("The longest value is: %s\n", maxLengthOfValue);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
