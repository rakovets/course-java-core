package com.rakovets.course.java.core.practice.xml;

import java.nio.file.Paths;
import java.util.List;

public class HibernateDemo {
    public static void main(String[] args) {
        HibernateReader hibernateReader = new HibernateReader();
        HibernateConfiguration readConfig = hibernateReader.readConfig(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml").toString());

        List<Mapping> mappingList = readConfig.getMappingList();
        List<Property> propertyList = readConfig.getPropertyList();
        propertyList.forEach(System.out::println);
        mappingList.forEach(System.out::println);

        HibernateConfiguration hibernateConfiguration = new HibernateConfiguration(propertyList, mappingList);
        HibernateWriter hibernateWriter = new HibernateWriter();
        hibernateWriter.createHibernateXML(
                Paths.get("src", "main", "resources", "practice", "xml", "hibernate-write.cfg.xml")
                        .toString(), hibernateConfiguration);
    }
}
