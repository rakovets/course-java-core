package com.rakovets.course.java.core.practice.jcf.collection.TaxService;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<Integer, Person> records;

    public Database() {
        records = new HashMap<>(25);
    }

    public void add(Person person, int id) {
        records.put(id, person);
    }

    public int size() {
        return records.size();
    }
}
