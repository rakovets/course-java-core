package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer example = new Computer("Lenovo", "V530", 2020, 570.0);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/ComputerInfo.txt"))) {
            oos.writeObject(example);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/ComputerInfo.txt"))) {
            Computer lenovo = (Computer) ois.readObject();
            System.out.printf("Producer: %s \t Model: %s \t Production year: %d \t Price: %.2f\n",
                    lenovo.getProducer(), lenovo.getModel(), lenovo.getProductionYear(), lenovo.getPrice());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
