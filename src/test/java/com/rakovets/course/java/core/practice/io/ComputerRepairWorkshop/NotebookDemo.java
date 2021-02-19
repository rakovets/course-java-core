package com.rakovets.course.java.core.practice.io.ComputerRepairWorkshop;

import java.io.*;

class NotebookDemo {

    public static void main(String[] args) throws Exception {

        Touchpad touchpad = new Touchpad("Bluetooth", "Scrolling");
        Notebook notebook = new Notebook("HP", "Pavilion", touchpad, "121", "black");
        String filePath = "src/main/resources/ComputerRepairWorkshop/notebook.txt";

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
        out.writeObject(notebook);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
        Notebook notebook1 = (Notebook)in.readObject();
        System.out.println(notebook1);
    }
}
