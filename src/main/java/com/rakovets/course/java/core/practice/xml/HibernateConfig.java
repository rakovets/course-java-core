package com.rakovets.course.java.core.practice.xml;

import java.util.LinkedHashMap;
import java.util.Map;

public class HibernateConfig {
    private Map<String, String> mapProperty;
    private Map<String, String> mapMapping;

    public HibernateConfig(Map<String, String> mapProperty, Map<String, String> mapMapping) {
        this.mapProperty = mapProperty;
        this.mapMapping = mapMapping;
    }

    public void setMapProperty(Map<String, String> mapProperty) {
        this.mapProperty = mapProperty;
    }

    public void setMapMapping(Map<String, String> mapMapping) {
        this.mapMapping = mapMapping;
    }

    public Map<String, String> getMapProperty() {
        return mapProperty;
    }

    public Map<String, String> getMapMapping() {
        return mapMapping;
    }
}
