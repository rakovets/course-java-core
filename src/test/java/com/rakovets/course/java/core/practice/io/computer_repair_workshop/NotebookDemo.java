package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

class NotebookDemo {

    public static void main(String[] args) throws Exception {

        Touchpad touchpad = new Touchpad("Bluetooth", "Scrolling");
        Notebook notebook = new Notebook("HP", "Pavilion", touchpad, "121", "black");
        Path filePath = Paths.get("src", "main", "resources", "computer_repair_workshop", "notebook.txt");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(String.valueOf(filePath)));
        out.writeObject(notebook);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(String.valueOf(filePath)));
        Notebook notebook1 = (Notebook)in.readObject();
        System.out.println(notebook1);
    }
}
