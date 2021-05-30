package com.rakovets.course.java.core.practice.xml;

import java.nio.file.Paths;
import java.util.Map;

public class HibernateDemo{
    public static void main(String[] args) {
        HibernateReader hibernateReader = new HibernateReader();
        HibernateConfig readConfig = hibernateReader.readConfig(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml").toString());
        Map<String, String> mappingMap = readConfig.getMapMapping();
        Map<String, String> propertyMap = readConfig.getMapProperty();


        for (Map.Entry<String, String> property : propertyMap.entrySet()) {
            System.out.println("Property name = " + property.getKey() + "    Value = " + property.getValue());
        }

        for (Map.Entry<String, String> map : mappingMap.entrySet()) {
            System.out.println("Key = " + map.getKey() + "    Value = " + map.getValue());
        }

        HibernateConfig hibernateConfiguration = new HibernateConfig(propertyMap, mappingMap);
        HibernateWriter hibernateWriter = new HibernateWriter();
        hibernateWriter.createHibernateXML(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate-write.cfg.xml")
                        .toString(), hibernateConfiguration);
    }
}
