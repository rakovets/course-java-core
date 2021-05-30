package com.rakovets.course.java.core.practice.xml;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

public class HibernateDemo{
    public static void main(String[] args) {

        Path userPropertiesPath = Paths.get("src", "main", "resources", "practice", "xml", "users.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(userPropertiesPath.toFile())) {
            p.load(reader);
        } catch (IOException ex) {
            ex.getStackTrace();
        }

        String pathToXMLForReading = p.getProperty("pathToXMLForReading");
        String pathToXMLForWriting = p.getProperty("pathToXMLForWriting");

        HibernateReader hibernateReader = new HibernateReader();
        HibernateConfig readConfig = hibernateReader.readConfig(pathToXMLForReading);
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
        hibernateWriter.createHibernateXML(pathToXMLForWriting, hibernateConfiguration);
    }
}
