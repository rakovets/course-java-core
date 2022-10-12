package com.rakovets.course.java.core.practice.enum_types;

public class Task07Print {
    public static void main(String[] args) {
        Task01040506Seasons[] seasons = Task01040506Seasons.values();

        for (Task01040506Seasons s : seasons) {
            System.out.println(s.toString());
        }
    }
}
