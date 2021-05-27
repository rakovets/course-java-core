package com.rakovets.course.java.core.practice.xml;

import java.util.LinkedHashMap;

public class HibernateConfiguration {
    private LinkedHashMap<String, String> mapProperty;
    private LinkedHashMap<String, String> mapMapping;

    public HibernateConfiguration() {

    }

    public HibernateConfiguration(LinkedHashMap<String, String> mapProperty, LinkedHashMap<String, String> mapMapping) {
        this.mapProperty = mapProperty;
        this.mapMapping = mapMapping;
    }

    public void setMapProperty(LinkedHashMap<String, String> mapProperty) {
        this.mapProperty = mapProperty;
    }

    public void setMapMapping(LinkedHashMap<String, String> mapMapping) {
        this.mapMapping = mapMapping;
    }

    public LinkedHashMap<String, String> getMapProperty() {
        return mapProperty;
    }

    public LinkedHashMap<String, String> getMapMapping() {
        return mapMapping;
    }
}
