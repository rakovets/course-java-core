package com.rakovets.java.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ticket13 {
    public static void main(String[] args) {
        String text = "";
        Map<String,Integer> mapWithStudents = new HashMap<>();
        String nameOfStudent = null;
        try(InputStream inputStream = new FileInputStream("Ticket13(in).txt");
            OutputStream outputStream = new FileOutputStream("Ticket13(out).txt")) {
            while (inputStream.available() > 0) {
                text += (char) inputStream.read();
            }
            String[] stringsWithStudents = text.split("\\.");
            for (String i: stringsWithStudents) {
                System.out.println(i);
            }
            for (String string: stringsWithStudents) {
                Pattern pattern = Pattern.compile("[a-zA-Z]+");
                Matcher matcher = pattern.matcher(string);
                nameOfStudent += matcher.group();
            }
            System.out.println(nameOfStudent);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
