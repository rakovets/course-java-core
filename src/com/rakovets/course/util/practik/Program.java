package com.rakovets.course.util.stringlist.practik;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<Integer, Person> mapWithPersons = new HashMap<>();
        mapWithPersons.put(123786, new Person(1239224, "James", "Braun"));
        mapWithPersons.put(872462, new Person(1987242, "Kan", "Gerskiy"));
        mapWithPersons.put(872452, new Person(1935744, "Keni", "Naik"));
        mapWithPersons.put(987245, new Person(2487428, "Sor", "Klark"));
        mapWithPersons.put(240890, new Person(9883654, "Sergio", "Polter"));
        mapWithPersons.put(827460, new Person(2048976, "Barn", "Higman"));
        mapWithPersons.put(248724, new Person(2984462, "Grey", "Iri"));
        mapWithPersons.put(395082, new Person(9828476, "Jimy", "Saimon"));
        mapWithPersons.put(982472, new Person(2947654, "Lori", "Lourense"));
        mapWithPersons.put(902874, new Person(2448248, "Grand", "Kwasp"));

        printMap(mapWithPersons);
        System.out.println("Map after sorting:");
        SortedMap<Integer, Person> sortedMap = new TreeMap<>();
        sortedMap.putAll(mapWithPersons);
        printMap(sortedMap);
    }
    static void printMap(Map<Integer, Person> map) {
        for (Map.Entry<Integer, Person> item : map.entrySet()) {
            System.out.println(item.toString());
        }
    }
}
