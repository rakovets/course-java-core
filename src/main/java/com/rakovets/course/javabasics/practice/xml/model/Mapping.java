package com.rakovets.course.javabasics.practice.xml.model;

public class Mapping {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "<mapping  " + getName() + "=" + getValue() + "/>";
    }
}

