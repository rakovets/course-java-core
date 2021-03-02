package com.rakovets.course.java.core.example.properties;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Java program to demonstrate Properties class to get information from the properties file
 */
public class PropertiesExample1ReadFromFile {
    /**
     * Main method for Demo
     *
     * @param args input arguments
     * @throws IOException throw IOException when work with IO
     */
    public static void main(String[] args) throws IOException {
        // get path for account.properties
        Path accountPropertiesPath =
                Paths.get("src", "main", "resources", "example", "properties", "account.properties");

        // create a reader object on the properties file
        FileReader reader = new FileReader(accountPropertiesPath.toFile());

        // create properties object
        Properties p = new Properties();

        // Add a wrapper around reader object
        p.load(reader);

        // access properties data
        System.out.printf("Username: '%s'\n", p.getProperty("username"));
        System.out.printf("Password: '%s'\n", p.getProperty("password"));
    }
}
