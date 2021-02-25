package com.rakovets.course.java.core.practice.io;

public class ComputerRepairWorkshopDemo {
    public static void main(String[] args) {
        ComputerRepairWorkshop.serializeObject(new Computer("Lenovo", "DXC", 2020), "src/test/resources/practice/io/computer.txt");
        ComputerRepairWorkshop.deserializeComputer("src/test/resources/practice/io/computer.txt");

        ComputerRepairWorkshop.serializeObject(new Notebook("HP", "BCX", 2018, "white", new Touchpad(50, 2)), "src/test/resources/practice/io/notebook.txt");
        ComputerRepairWorkshop.deserializeNotebook("src/test/resources/practice/io/notebook.txt");
    }
}
