package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.ArrayList;

public class CitiesFilterUtil {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){{
            add("Belgrade");
            add("Minsk  ");
            add("Moscow");
            add("Kiev");
            add("London");
            add("New York");
            add("Sydney");
            add("St.Petersburg");
            add("Dresden");
            add("Hamburg");
            add("Berlin");
            add("Potsdam");
            add("Essen");
            add("Leipzig");
            add("Stuttgart");
            add("Konigsberg");
            add("Minsk");
        }};
        list.stream()
                .forEach(System.out::println);
         }
}
