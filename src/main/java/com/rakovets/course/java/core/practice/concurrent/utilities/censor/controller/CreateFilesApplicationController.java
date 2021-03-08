package com.rakovets.course.java.core.practice.concurrent.utilities.censor.controller;

import java.io.IOException;

public class CreateFilesApplicationController {
    public void start() throws IOException {
        CreateFilesController createFilesController = new CreateFilesController();
        createFilesController.createDirectory();
        createFilesController.createText1();
        createFilesController.createText2();
        createFilesController.createFileWithForbiddenWords();
    }
}
