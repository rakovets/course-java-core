package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringTest {
    public static void main(String[] args) {
        TextMonitoring tx = new TextMonitoring();
        tx.researchText("Mama Papa Mama Papa Mama Papa mama Papa mama papa");
        System.out.println(tx);
        System.out.println(tx.getCountUniqueWords());
        System.out.println(tx.getUniqueWords());
        System.out.println(tx.getFrequencyWord("papa"));
        System.out.println(tx.getFrequencyWords(true));
    }
}
