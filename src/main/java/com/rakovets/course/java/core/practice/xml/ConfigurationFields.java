package com.rakovets.course.java.core.practice.xml;

public enum ConfigurationFields {
    PROPERTY("property"),
    NAME("name"),
    CLASS("class"),
    MAPPING("mapping"),
    HIBERNATE_CONFIGURATION_HIBERNAME("hibernate-configurationHibernate"),
    SESSION_FACTORY("session-factory");
    private String type;

    ConfigurationFields(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
