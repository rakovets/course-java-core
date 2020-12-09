package com.rakovets.course.javabasics.example.xml;

import com.rakovets.course.javabasics.example.xml.service.StAXWriter;

import java.nio.file.Paths;

public class StAXExample2Writing {
    public static void main(String[] args) {
        StAXWriter configFile = new StAXWriter();
        configFile.saveConfig(Paths.get("src", "main", "resources", "example", "xml", "stax-writing.xml").toString());
    }
}
