package com.rakovets.course.java.core.example.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Java program to demonstrate Properties class to create the properties file
 */
public class PropertiesExample3CreateAndWriteToFile {
    /**
     * Main method for Demo
     *
     * @param args input arguments
     * @throws IOException throw IOException when work with IO
     */
    public static void main(String[] args) throws IOException {
        // create an instance of Properties
        Properties p = new Properties();

        // add properties to it
        p.setProperty("name", "Dmitry Rakovets");
        p.setProperty("email", "dmitryrakovets@gmail.com");

        // get path for account.properties
        Path userPropertiesPath =
                Paths.get("src", "main", "resources", "example", "properties", "user.properties");

        // store the properties to a file
        p.store(new FileWriter(userPropertiesPath.toFile()), "Properties Example");
    }
}
