package com.rakovets.course.javabasics.practice.xml;

import com.rakovets.course.javabasics.example.xml.StAXWriter;
import com.rakovets.course.javabasics.practice.xml.model.Mapping;
import com.rakovets.course.javabasics.practice.xml.model.Property;

import java.nio.file.Paths;

import java.util.List;


public class HibernateDemo {
    public static void main(String[] args) {
        XMLReader read = new XMLReader();
        Hibernate readConfig = read.readConfig(Paths.get("src", "main", "resources", "xml", "hibernate.cfg.xml").toString());
        List<Mapping> mapList = readConfig.getMappingList();
        List<Property> propList = readConfig.getPropertyList();
        propList.forEach(System.out::println);
        mapList.forEach(System.out::println);

        Hibernate xmlWrit = new Hibernate(propList,mapList);
        XMLWriter configXML = new XMLWriter();
        configXML.addConfigToXML(Paths.get("src", "main", "resources", "xml", "hibernate-wrote.xml").toString(),xmlWrit);






    }
}

