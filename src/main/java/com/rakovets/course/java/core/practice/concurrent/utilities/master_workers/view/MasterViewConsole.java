package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.view;

public class MasterViewConsole implements MasterView {

    public void enterNumber() {
        System.out.println("Enter any positive number:");
    }

    public void invalidInput() {
        System.out.println("Your input is invalid");
    }
}
