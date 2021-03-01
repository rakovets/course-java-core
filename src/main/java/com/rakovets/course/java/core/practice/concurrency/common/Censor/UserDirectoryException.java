package com.rakovets.course.java.core.practice.concurrency.common.Censor;

import java.io.File;

public class UserDirectoryException extends Exception {
    private final File directory;

    public UserDirectoryException(File directory) {
        this.directory = directory;
    }

    public String toString() {
        return "Directory " + directory + " doesn't exist";
    }
}
