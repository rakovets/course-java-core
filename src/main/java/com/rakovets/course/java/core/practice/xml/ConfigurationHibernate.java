package com.rakovets.course.java.core.practice.xml;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationHibernate {
    private Map<String,String> properties = new HashMap<>();
    private Map<String,String> mapping = new HashMap<>();

    public Map<String, String> getMapping() {
        return mapping;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void putToProperties(String key, String value) {
        properties.put(key, value);
    }

    public void putToMapping(String key, String value) {
        mapping.put(key, value);
    }
}
