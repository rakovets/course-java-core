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

    public static void deSerializeComputer(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Computer computer = (Computer) ois.readObject();
            System.out.printf("COMPUTER:\nManufacturer: %s\nModel: %s\nYear: %d\n", computer.getManufacturer(), computer.getModel(), computer.getYear());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deSerializeNotebook(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Notebook notebook = (Notebook) ois.readObject();
            System.out.printf("NOTEBOOK:\nManufacturer: %s \nModel: %s \nYear: %d\nColor: %s\nRadius: %d\nButtons: %d", notebook.getManufacturer(), notebook.getModel(), notebook.getYear(), notebook.getColor(), notebook.getTouchpad().getRadius(), notebook.getTouchpad().getButtons());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
