package com.rakovets.course.java.core.example.io;

import java.io.File;

public abstract class ExampleFiles {
    public static File INPUT_FILE = new File("src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator
            + "example" + File.separator
            + "io" + File.separator
            + ".." + File.separator
            + "io" + File.separator
            + "input.file" + File.separator);
    public static File OUTPUT_FILE = new File("src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator
            + "example" + File.separator
            + "io" + File.separator
            + "output.file" + File.separator);
    public static File TRANSFER_FILE = new File("src" + File.separator
            + "main" + File.separator
            + "resources" + File.separator
            + "example" + File.separator
            + "io" + File.separator
            + "transfer.file" + File.separator);
}
