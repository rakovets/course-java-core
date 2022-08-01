package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        String text = "Every day in elementary school in America begins" +
                " Children have classes tillclock children have lunch." +
                " Many boys and girls bring their lunch from home. But some of them go for" +
                " lunch to a school cafeteria." +
                "Java. Bradley prepares school lunches almost" +
                " every weekday for her two children. Sometimes she" +
                " gives the children money and they eat in the school cafeteria." +
                " !$$% But usually the children prefer to take a lunch from home. Children Children";
        System.out.println(TextMonitoring.researchText(text));

        TextMonitoring example = new TextMonitoring(text);

        System.out.println("Total unique words: " + example.getCountUniqueWords(text));
        System.out.println("Unique words: " + example.getUniqueWords(text));
        System.out.println("Word 'Children' repeats times: " + example.getFrequencyWord(text, "Children"));
        System.out.println(example.getFrequencyWords(text, true));
    }
}
