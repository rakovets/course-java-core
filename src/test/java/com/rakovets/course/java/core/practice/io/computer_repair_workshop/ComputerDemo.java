package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

class ComputerDemo {

    public static void printData(Computer computer) {
        System.out.println("manufacturer = " + computer.getManufacturer());
        System.out.println("model = " + computer.getModel());
    }

    public static void main(String[] args) throws IOException {
        Computer computer = new Computer("HP", "Pavilion");
        Path filePath = Paths.get("src", "main", "resources", "computer_repair_workshop", "computer.txt");

        try {
            FileOutputStream file = new FileOutputStream(String.valueOf(filePath));
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(computer);
            out.close();
            file.close();
            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization:");
            printData(computer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream file = new FileInputStream(String.valueOf(filePath));
            ObjectInputStream in = new ObjectInputStream(file);
            computer = (Computer) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization:");
            printData(computer);
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
