package com.rakovets.course.java.core.practice.xml;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HibernateDemo {
    public static void main(String[] args) {
        HibernateReader hibernateReader = new HibernateReader();
        HibernateConfiguration readConfig = hibernateReader.readConfig(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml").toString());

        LinkedHashMap<String, String> mappingMap = readConfig.getMapMapping();
        LinkedHashMap<String, String> propertyMap = readConfig.getMapProperty();

        for (Map.Entry<String, String> property : propertyMap.entrySet()) {
            System.out.println(" Key = " + property.getKey() + "    Value = " + property.getValue());
        }

        for (Map.Entry<String, String> map : mappingMap.entrySet()) {
            System.out.println(" Key = " + map.getKey() + "    Value = " + map.getValue());
        }

        HibernateConfiguration hibernateConfiguration = new HibernateConfiguration(propertyMap, mappingMap);
        HibernateWriter hibernateWriter = new HibernateWriter();
        hibernateWriter.createHibernateXML(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate-write.cfg.xml")
                        .toString(), hibernateConfiguration);
    }
}
