package com.rakovets.course.java.core.practice.concurrent.utilities.censor.exceptions;

import java.nio.file.Path;

public class UserDirectoryException extends Exception {
    private final Path directory;

    public UserDirectoryException(Path directory) {
        this.directory = directory;
    }

    public String toString() {
        return "Directory " + directory + " doesn't exist";
    }
}

