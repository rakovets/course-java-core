package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        String text = "Word 1 times, word 3 times, wOrd 1 times, Java 4 times,  hello 2 times, times 7 times;!$$% _ word ?-_, word, Java Java hello Java  ";

        System.out.println("Total unique words: " + textMonitoring.getCountUniqueWords(text));
        System.out.println("Unique words: " + textMonitoring.getUniqueWords(text));
        System.out.println("Word 'Java' repeats times: " + textMonitoring.getFrequencyWord(text, "Java"));
        System.out.println(textMonitoring.getFrequencyWords(text, true));
        System.out.println(textMonitoring.getFrequencyWords(text, false));
    }
}
