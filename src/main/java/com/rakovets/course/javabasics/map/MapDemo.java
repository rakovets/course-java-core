package com.rakovets.course.javabasics.map;

public class MapDemo {

    public static void main(String[] args) {

        String text = "Set up an organization to improve the way your team. The road to the Hell!Going to play?";
        System.out.println("Research \n" + TextMonitoring.researchText(text).toString());
        System.out.println("UniqCount \n " + TextMonitoring.getCountUniqueWords(text));
        System.out.println("UniqWord \n " + TextMonitoring.getUniqueWords(text));
        System.out.println("Word \n " + TextMonitoring.getWork(text, "roooby"));

    }
}
