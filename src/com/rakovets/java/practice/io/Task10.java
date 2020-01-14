package com.rakovets.java.practice.io;

import java.io.*;

public class Task10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Touchpad touchpad = new Touchpad("Predator1", "Brown", 230);
        Notebook notebook = new Notebook(4, "Lenovo", 450, touchpad, "Geforce 1050");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("task10_Notebook_txt"));
        objectOutputStream.writeObject(notebook);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("task10_Notebook_txt"));
        Notebook note = (Notebook) objectInputStream.readObject();
        System.out.println(note);
        objectInputStream.close();
    }
}
