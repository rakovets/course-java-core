package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;

public class ComputerDemo {
    public static void main(String[] args) {
        SerializeUtils.serialize("src/main/resources/practice/complucter.dat",
                new Computer("AMD", "Nvidia", "4k", 18.0));
        System.out.println(SerializeUtils.deserialize("src/main/resources/practice/complucter.dat"));
    }
}
