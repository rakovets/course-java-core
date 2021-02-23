package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NotebookDemo {
    public static void main(String[] args) {
        Computer example = new Notebook("Lenovo", "V530", 2020, 570.0, new Touchpad("R280", "Synaptics"),45);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/NotebookInfo.txt"))) {
            oos.writeObject(example);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/NotebookInfo.txt"))) {
            Notebook lenovo = (Notebook) ois.readObject();
            System.out.printf("Producer: %s \nModel: %s \nProduction year: %d \nPrice: %.2f \nTouchpad: %s \nDiagonal: %d \n",
                    lenovo.getProducer(), lenovo.getModel(), lenovo.getProductionYear(),
                    lenovo.getPrice(), lenovo.getTouchpad().toString(), lenovo.getDiagonal());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
