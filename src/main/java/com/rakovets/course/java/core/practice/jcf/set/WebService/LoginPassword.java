package com.rakovets.course.java.core.practice.jcf.set.WebService;

import java.util.HashMap;
import java.util.Map;

public class LoginPassword<T, S> {
    private final Map<String, RegisteredClient> records;

    public LoginPassword() {
        records = new HashMap<>(25);
    }

    public void add(String login, RegisteredClient password) {
        records.put(login, password);
    }

    public int size() {
        return records.size();
    }
}
