package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.controller;

import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.exceptions.UserInputException;

public class ThreadMasterControllerStarter {
    public static void main(String[] args) throws UserInputException {
        ThreadMasterController threadMasterController = new ThreadMasterController();
        threadMasterController.start();
    }
}
