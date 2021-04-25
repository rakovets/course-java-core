package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.Map;

public class User {
    private String key;
    private String value;

    public User() {

    }
    public User(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public String setKey(String key) {
        return this.key = key;
    }

    public String setValue(String value) {
        return this.value = value;
    }
}
