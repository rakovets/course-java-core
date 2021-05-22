package com.rakovets.course.java.core.practice.concurrency.copy_file;

import java.io.*;

public class BackUpFolder {

    public static void copy(File sourceLocation, File targetLocation) throws IOException {
        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }
            for (String f : sourceLocation.list()) {
                copy(new File(sourceLocation, f), new File(targetLocation, f));
            }
        } else {
            try (
                    InputStream in = new FileInputStream(sourceLocation);
                    OutputStream out = new FileOutputStream(targetLocation)) {
                byte[] buf = new byte[1024];
                int length;
                while ((length = in.read(buf)) > 0) {
                    out.write(buf, 0, length);
                }
            }
        }
    }
}
