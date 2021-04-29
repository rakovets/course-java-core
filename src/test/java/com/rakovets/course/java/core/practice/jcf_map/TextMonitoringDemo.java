package com.rakovets.course.java.core.practice.jcf_map;

import java.util.Collection;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String text = "Java was developed by James Gosling, who is known as the father of Java, in 1995." +
                " James Gosling and his team members started the project in the early '90s. Currently, " +
                " Java is used in internet programming, mobile devices, games, e-business solutions, etc.";
        System.out.println(TextMonitoring.researchText(text));

        TextMonitoring example = new TextMonitoring(text);
        Collection<String> unique = example.getUniqueWords();
        for (String word : unique) {
            System.out.println(word);
        }
    }
}
