package com.rakovets.course.java.core.practice.concurrent.utilities.censor.controller;

import java.io.IOException;

public class CreateFilesControllerStarter {
    public static void main(String[] args) throws IOException {
        CreateFilesApplicationController createFilesApplicationController = new CreateFilesApplicationController();
        createFilesApplicationController.start();
    }
}
