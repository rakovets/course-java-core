package com.rakovets.java.io;

import java.io.*;

/**
 *Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения полей в консоль.
 */

public class Task09_Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Computer computer = new Computer("Intel", 100, true);
		ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("task09_Computer.dat"));
		objectOutput.writeObject(computer);
		objectOutput.close();

		ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("task09_Computer.dat"));
		Computer comp = (Computer) objectInput.readObject();
		System.out.printf("Name: %s \t Warranty: %d \t Update: %s \n", comp.getName(), comp.getWarranty(), comp.getUpdated());
	}
}