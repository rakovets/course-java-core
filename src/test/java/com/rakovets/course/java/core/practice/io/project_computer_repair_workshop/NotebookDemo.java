package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;


class NotebookDemo {
    public static void main(String[] args) {
        SerializeUtils.serialize("src/main/resources/practice/macBook.dat", new Notebook
                ("Intel", "Nvidia", "4k", 15.6, "Apple",
                        new Touchpad("4", true), "Oleg"));
        System.out.println(SerializeUtils.deserialize("src/main/resources/practice/macBook.dat"));
    }
}
