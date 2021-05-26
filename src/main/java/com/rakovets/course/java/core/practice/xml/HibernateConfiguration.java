package com.rakovets.course.java.core.practice.xml;

import java.util.List;

public class HibernateConfiguration {
    private List<Property> propertyList;
    private List<Mapping> mappingList;

    public HibernateConfiguration() {

    }

    public HibernateConfiguration(List<Property> propertyList, List<Mapping> mappingList) {
        this.propertyList = propertyList;
        this.mappingList = mappingList;
    }

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
