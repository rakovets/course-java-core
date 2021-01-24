package com.rakovets.course.java.core.example.oop.classesandobjects.model;

public class Human {
    int age=5;
    int getAge(){
        return age;
    }
    int weigh;

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println();
        }
    static class boy extends Human {
        public String eyeColour = "green";

    }
}
