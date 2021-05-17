package com.rakovets.course.java.core.example.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example19UsingStandardInput {
    public static void main(String[] args) {
        try (InputStreamReader is = new InputStreamReader(System.in, StandardCharsets.UTF_8);
             BufferedReader bis = new BufferedReader(is);
             FileOutputStream fos = new FileOutputStream(ExampleFiles.OUTPUT_FILE);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {

            String dialogText = "Введите Ваше имя и нажмите <Enter>:\n";
            System.out.print(dialogText);
            bw.write(dialogText);

            String name = bis.readLine();
            bw.write(name + "\n");

            String greetingText = "Привет, " + name + "\n";
            System.out.print(greetingText);
            bw.write(greetingText);
        } catch (IOException e) {
            System.err.println("Ошибка ввода.\n" + e);
        }
    }
}
