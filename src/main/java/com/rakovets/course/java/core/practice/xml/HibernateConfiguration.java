package com.rakovets.course.java.core.practice.xml;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HibernateConfiguration {
    private HashMap<String, String> propertyMap = new LinkedHashMap<>();
    private HashMap<String, String> mappingMap = new LinkedHashMap<>();


    public void putInPropertyMap(String key, String value) {
        propertyMap.put(key, value);
    }

    public void putInMappingMap(String key, String value) {
        mappingMap.put(key, value);
    }

    public HashMap<String, String> getPropertyMap() {
        return propertyMap;
    }

    public HashMap<String, String> getMappingMap() {
        return mappingMap;
    }
}
