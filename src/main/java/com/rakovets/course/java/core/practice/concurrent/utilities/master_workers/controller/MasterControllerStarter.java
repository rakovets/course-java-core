package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.controller;

import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.exceptions.UserInputException;

public class MasterControllerStarter {
    public static void main(String[] args) throws UserInputException {
        MasterController masterController = new MasterController();
        masterController.start();
    }
}
