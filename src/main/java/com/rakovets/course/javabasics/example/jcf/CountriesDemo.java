package com.rakovets.course.javabasics.example.jcf;

import java.util.ArrayList;
import java.util.ListIterator;

public class CountriesDemo {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();

        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }

        listIter.set("Португалия");

        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }
    }
}