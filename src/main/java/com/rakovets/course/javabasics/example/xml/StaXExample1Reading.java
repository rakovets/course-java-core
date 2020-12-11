package com.rakovets.course.javabasics.example.xml;

import com.rakovets.course.javabasics.example.xml.model.Item;

import java.nio.file.Paths;
import java.util.List;

public class StaXExample1Reading {
    public static void main(String[] args) {
        StAXReader read = new StAXReader();
        List<Item> readConfig = read.readConfig(Paths.get("src", "main", "resources", "xml", "config.xml").toString());
        System.out.println(Paths.get("src", "main", "resources", "xml", "config.xml").toString());
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }
}
