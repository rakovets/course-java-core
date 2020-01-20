package com.rakovets.java.solid.my.userHelper;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveToFile extends IOException {
    FileWriter fileWriter = null;
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String time;


    public void saveFilePizza(String string) {
        time = dateTime.format(formatter);

        try {
            fileWriter = new FileWriter("textInfoOder.txt", true);
            fileWriter.write("\n" + time);
            fileWriter.write(string);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
