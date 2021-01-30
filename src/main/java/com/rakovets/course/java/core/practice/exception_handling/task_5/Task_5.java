package com.rakovets.course.java.core.practice.exception_handling.task_5;

public class Task_5 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        try {
            doCheck(smartphone);
        } catch (ExistObjectException e) {
            System.out.println(e.getDescription());
        }
    }

    public static void doCheck(Smartphone smartphone) throws ExistObjectException {
        if (smartphone.getModel() == null) {
            throw new ExistObjectException("Num is can't be null", "Smartphone is not exist");
        }
    }

}
