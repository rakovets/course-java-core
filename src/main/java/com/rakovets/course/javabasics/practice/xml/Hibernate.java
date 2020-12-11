package com.rakovets.course.javabasics.practice.xml;

import com.rakovets.course.javabasics.practice.xml.model.Mapping;
import com.rakovets.course.javabasics.practice.xml.model.Property;

import java.util.HashMap;
import java.util.List;


public class Hibernate {

    private List<Property> propertyList;
    private List<Mapping> mappingList;

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public void setMappingList(List<Mapping> mappingList) {
        this.mappingList = mappingList;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public List<Mapping> getMappingList() {
        return mappingList;
    }


}
