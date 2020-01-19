package com.rakovets.java.io;

import java.io.*;

public class Ticket9 {
    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream( new FileOutputStream("Ticket9(out).dat"));
            ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("Ticket9(out).dat"))) {
            Computer computer1 = new Computer(1500, "Lenovo");
            objectOutputStream.writeObject(computer1);
            try {
                Computer computer2 = (Computer) objectInputStream.readObject();
                System.out.printf("Date about computer: cost - %s, model - %s", computer2.getCost(), computer2.getModel());
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
