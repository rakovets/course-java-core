package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;

public class CitiesFilterUtil {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){{
            add("Tokyo");
            add("Minsk");
            add("Moscow");
            add("Kiev");
        }};
        list.stream()
                .forEach(System.out::println);
         }




}
