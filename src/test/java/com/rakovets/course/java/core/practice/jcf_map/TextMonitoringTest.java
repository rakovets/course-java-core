package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringTest {
    public static void main(String[] args) {
        TextMonitoring tx = new TextMonitoring();
        tx.researchText("Mama Papa Mama Papa Mama Papa mama papa mama papa");
        System.out.println(tx);
    }
}
