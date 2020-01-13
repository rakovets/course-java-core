package com.rakovets.java.io;

import java.io.*;

/**
 * Создать класс Notebook - наследник Computer.
 * В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
 * Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 * Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */

public class Task10_Demo {
	public static void main(String[] args) throws Exception, ClassNotFoundException {
		Touchpad touchpad = new Touchpad("Logitech Wireless", "black", 100);
		Notebook notebook = new Notebook("ASUS ROG G703", 5, false, touchpad, "GeForce RTX 2080");
		ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("task10_Notebook.dat"));
		objectOutput.writeObject(notebook);
		objectOutput.close();

		ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("task10_Notebook.dat"));
		Notebook note = (Notebook) objectInput.readObject();
		System.out.println(note);
	}
}