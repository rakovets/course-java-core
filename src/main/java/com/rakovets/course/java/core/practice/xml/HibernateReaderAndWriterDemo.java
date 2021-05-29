package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.*;

public class HibernateReaderAndWriterDemo {
    public static void main(String[] args) {
        HibernateConfiguration hibernateConfiguration = new HibernateConfiguration();
        String paths = Paths.get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml").toString();
        HibernateReader hibernateReader = new HibernateReader(hibernateConfiguration);
        Map<String, String> configurationsMap = new LinkedHashMap<>();
        try {
            hibernateReader.readXmlFile(paths);
            configurationsMap.putAll(hibernateConfiguration.getPropertyMap());
            configurationsMap.putAll(hibernateConfiguration.getMappingMap());
            for (Map.Entry<String, String> i : configurationsMap.entrySet()) {
                System.out.println(i.getKey() + ": " + i.getValue());
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
