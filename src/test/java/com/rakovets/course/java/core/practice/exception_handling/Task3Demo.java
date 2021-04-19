package com.rakovets.course.java.core.practice.exception_handling;

public class Task3Demo {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        try {
            double side = task3.setSide(-25);
            System.out.println("Perimetr of square with side " + side + " = " + task3.getPerimetrSquare());
        } catch (SideException ex) {
            ex.printStackTrace();
        }
    }
}
