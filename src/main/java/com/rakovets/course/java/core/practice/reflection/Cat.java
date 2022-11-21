package com.rakovets.course.java.core.practice.reflection;

public class Cat {
    private String name;
    private String breed;
    private int age;

    public Cat (String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void  setAge(int age) {
        this.age = age;
    }

    public void setData(final String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [name: " + name + ", breed: " + breed + ", age: " + age + "]";
    }
}
