package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeUtils {

    public static void serialize(String filepath, Object className) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(filepath))) {
            oos.writeObject(className);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String deserialize(String filepath) {
        try (
                ObjectInputStream oos = new ObjectInputStream(
                        new FileInputStream(filepath))) {
            Object comp = oos.readObject();
            return comp.toString();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return filepath;
    }
}
