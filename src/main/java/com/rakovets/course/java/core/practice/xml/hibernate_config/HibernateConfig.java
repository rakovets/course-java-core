package com.rakovets.course.java.core.practice.xml.hibernate_config;

import lombok.Getter;
import lombok.Setter;
import java.util.LinkedHashMap;

public class HibernateConfig {
    @Setter
    @Getter
    private LinkedHashMap<String, String> mapProperty;
    @Setter
    @Getter
    private LinkedHashMap<String, String> mapMapping;

    public HibernateConfig() {

    }

    public HibernateConfig(LinkedHashMap<String, String> mapProperty, LinkedHashMap<String, String> mapMapping) {
        this.mapProperty = mapProperty;
        this.mapMapping = mapMapping;
    }
}
