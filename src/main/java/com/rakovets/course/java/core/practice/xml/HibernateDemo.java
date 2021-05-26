package com.rakovets.course.java.core.practice.xml;

import java.nio.file.Paths;
import java.util.List;

public class HibernateDemo{
    public static void main(String[] args) {
        HibernateReader hibernateReader = new HibernateReader();
        HibernateConfiguration readConfig = hibernateReader.readConfig(Paths.get("src", "main", "resources","practice", "xml", "hibernate.cfg.xml").toString());

        List<Mapping> mapList = readConfig.getMappingList();
        List<Property> propList = readConfig.getPropertyList();
        propList.forEach(System.out::println);
        mapList.forEach(System.out::println);
    }
}
