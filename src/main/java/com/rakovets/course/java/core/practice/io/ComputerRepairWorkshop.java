package com.rakovets.course.java.core.practice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ComputerRepairWorkshop {
    public static void serializeObject(Object obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(obj);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deserializeComputer(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Computer computer = (Computer) ois.readObject();
            System.out.printf(computer.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deserializeNotebook(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Notebook notebook = (Notebook) ois.readObject();
            System.out.printf(notebook.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
