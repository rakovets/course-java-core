package com.rakovets.course.java.core.practice.xml;
import java.util.LinkedHashMap;

public class HibernateConfiguration {
    private LinkedHashMap<String, String> property;
    private LinkedHashMap<String, String> mapping;

    public HibernateConfiguration() {
    }

    public HibernateConfiguration(LinkedHashMap<String, String> property, LinkedHashMap<String, String> mapping) {
        this.property = property;
        this.mapping = mapping;
    }

    public LinkedHashMap<String, String> getProperty() {
        return property;
    }

    public void setProperty(LinkedHashMap<String, String> property) {
        this.property = property;
    }

    public LinkedHashMap<String, String> getMapping() {
        return mapping;
    }

    public void setMapping(LinkedHashMap<String, String> mapping) {
        this.mapping = mapping;
    }

}
