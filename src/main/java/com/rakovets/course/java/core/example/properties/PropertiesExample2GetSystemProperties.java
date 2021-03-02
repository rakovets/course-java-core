package com.rakovets.course.java.core.example.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Java program to demonstrate Properties class to get all the system properties
 */
public class PropertiesExample2GetSystemProperties {
    /**
     * Main method for Demo
     *
     * @param args input arguments
     */
    public static void main(String[] args) {
        // get all the system properties
        Properties p = System.getProperties();

        // stores set of properties information
        Set<Map.Entry<Object, Object>> set = p.entrySet();

        // iterate over the set
        for (Map.Entry<Object, Object> entry : set) {
            // print each property
            System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
        }
    }
}
