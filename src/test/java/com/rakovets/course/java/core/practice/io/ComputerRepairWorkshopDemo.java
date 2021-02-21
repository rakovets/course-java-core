package com.rakovets.course.java.core.practice.io;

public class ComputerRepairWorkshopDemo {
    public static void main(String[] args) {
        ComputerRepairWorkshop.serializeObject(new Computer("Lenovo", "DXC", 2020), "src/test/java/com/rakovets/course/java/core/practice/io/filesForComputerRepairWorkshop/computer.txt");
        ComputerRepairWorkshop.deSerializeComputer("src/test/java/com/rakovets/course/java/core/practice/io/filesForComputerRepairWorkshop/computer.txt");

        ComputerRepairWorkshop.serializeObject(new Notebook("HP", "BCX", 2018, "white", new Touchpad(50, 2)), "src/test/java/com/rakovets/course/java/core/practice/io/filesForComputerRepairWorkshop/notebook.txt");
        ComputerRepairWorkshop.deSerializeNotebook("src/test/java/com/rakovets/course/java/core/practice/io/filesForComputerRepairWorkshop/notebook.txt");
    }
}
