package com.rakovets.course.java.core.practice.xml;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class HibernateDemo {
    public static void main(String[] args) {
        HibernateReader read = new HibernateReader();
        HibernateConfiguration readConfig = read.readConfig(Paths.get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml").toString());
        LinkedHashMap<String, String> propertys = readConfig.getProperty();
        LinkedHashMap<String, String> mapping = readConfig.getMapping();
        for (Map.Entry<String, String> property : propertys.entrySet()) {
            System.out.println("[Name = " + property.getKey() + " _______ Value = " + property.getValue() + "]");
        }
        for (Map.Entry<String, String> map : mapping.entrySet()) {
            System.out.println("[Class = " + map.getKey() + " _________ Value = " + map.getValue() + "]");
        }
        HibernateConfiguration hibernateConfiguration = new HibernateConfiguration(propertys, mapping);
        HibernateWriter configFile = new HibernateWriter();
        configFile.saveConfigFile(Paths.get("src", "main", "resources", "practice", "xml", "hibernate-writer.xml").toString(),hibernateConfiguration);
    }
}
