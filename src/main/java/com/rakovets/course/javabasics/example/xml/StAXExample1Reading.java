package com.rakovets.course.javabasics.example.xml;

import com.rakovets.course.javabasics.example.xml.model.Item;
import com.rakovets.course.javabasics.example.xml.service.StAXReader;

import java.nio.file.Paths;
import java.util.List;

public class StAXExample1Reading {
    public static void main(String[] args) {
        StAXReader read = new StAXReader();
        List<Item> readConfig = read.readConfig(Paths.get("src", "main", "resources", "example", "xml", "stax-reading.xml").toString());
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }
}
