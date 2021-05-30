package com.rakovets.course.java.core.practice.xml;

import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.rakovets.course.java.core.practice.xml.HibernateReader.property;

public class HibernateDemo {
    public static void main(String[] args) {


        HibernateReader hibernateReader = new HibernateReader();
        HibernateConfig readConfig = hibernateReader.readConfig(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml").toString());
        LinkedHashMap<String, String> property = readConfig.getProperty();
        LinkedHashMap<String, String> mapping = readConfig.getMapping();


        for (Map.Entry<String, String> properties : property.entrySet()) {
            System.out.println(" Key = " + properties.getKey() + "    Value = " + properties.getValue());
        }

        for (Map.Entry<String, String> map : mapping.entrySet()) {
            System.out.println(" Key = " + map.getKey() + "    Value = " + map.getValue());
        }

        HibernateConfig hibernateConfig = new HibernateConfig(property,mapping);
        HibernateWriter hibernateWriter = new HibernateWriter();
        hibernateWriter.createConfig(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate-write.cfg.xml")
                        .toString(), hibernateConfig);
    }
}

