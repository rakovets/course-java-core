package com.rakovets.course.java.core.practice.io.ComputerRepairWorkshop;

import java.io.*;

class ComputerDemo {

    public static void printData(Computer computer) {
        System.out.println("manufacturer = " + computer.getManufacturer());
        System.out.println("model = " + computer.getModel());
    }

    public static void main(String[] args) {
        Computer computer = new Computer("HP", "Pavilion");
        String filePath = "src/main/resources/ComputerRepairWorkshop/computer.txt";

        try {
            FileOutputStream file = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(computer);
            out.close();
            file.close();
            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization:");
            printData(computer);
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        try {
            FileInputStream file = new FileInputStream(filePath);
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
