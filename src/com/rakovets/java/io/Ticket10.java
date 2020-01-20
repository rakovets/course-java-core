package com.rakovets.java.io;

import java.io.*;

public class Ticket10 {
    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Ticket10.dat"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Ticket10.dat"))) {
            Computer computer1 = new Notebook(2000, "HP", new Touchpad(true), 5600);
            objectOutputStream.writeObject(computer1);
            try {
                Notebook computerFromFile = (Notebook) objectInputStream.readObject();
                System.out.printf("Computer: cost - %d, model - %s, touchpad - %b, battery capacity - %d.",
                        computerFromFile.getCost(), computerFromFile.getModel(), computerFromFile.getTouchpad().getActive(),
                        computerFromFile.getBatteryCapacity());
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
