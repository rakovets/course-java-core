package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.Map;

public class User {

    private String key;
    private String Value;

    public User(String key, String value){
        this.key = key;
        this.Value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return Value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        Value = value;
    }
}
