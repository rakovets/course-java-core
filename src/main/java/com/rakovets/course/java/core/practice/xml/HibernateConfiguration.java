package com.rakovets.course.java.core.practice.xml;

import java.util.LinkedHashMap;

public class HibernateConfiguration {
    private LinkedHashMap<String, String> mapProperty;
    private LinkedHashMap<String, String> mapMapping;

    public HibernateConfiguration() {
    }

    public HibernateConfiguration(LinkedHashMap<String, String> propertyMap, LinkedHashMap<String, String> mappingMap) {
        mapMapping = mappingMap;
        mapProperty = propertyMap;

    }

    public LinkedHashMap<String, String> getMapProperty() {
        return mapProperty;
    }

    public LinkedHashMap<String, String> getMapMapping() {
        return mapMapping;
    }

    public void setMapProperty(LinkedHashMap<String, String> mapProperty) {
        this.mapProperty = mapProperty;
    }

    public void setMapMapping(LinkedHashMap<String, String> mapMapping) {
        this.mapMapping = mapMapping;
    }
}
