package com.rakovets.java.practice.io;

import java.io.*;

public class Task09 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer computer = new Computer(3, "Accer", 270);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("task09_Computer_txt"));
        objectOutputStream.writeObject(computer);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("task09_Computer_txt"));
        Computer computer1 = (Computer) objectInputStream.readObject();
        System.out.printf("Breed : %d \t Name : %s \t Value : %d \n", computer1.getBreed(), computer1.getName(), computer1.getValue());
        objectInputStream.close();
    }
}
