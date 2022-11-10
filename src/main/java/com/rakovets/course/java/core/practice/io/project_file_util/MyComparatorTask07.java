package com.rakovets.course.java.core.practice.io.project_file_util;

import java.util.Comparator;
import java.util.Map;

public class MyComparatorTask07 implements Comparator<Map.Entry> {
    private String name;
    private int age;
    public MyComparatorTask07 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        return (int) o1.getValue() - (int) o2.getValue();
    }
}
