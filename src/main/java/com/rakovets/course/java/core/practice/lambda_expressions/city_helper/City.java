package com.rakovets.course.java.core.practice.lambda_expressions.city_helper;

import java.util.Objects;

public class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return name == city.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
