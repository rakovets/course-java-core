package com.rakovets.course.java.core.practice.jcf_map.words_monitoring;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText("Giraffes are very beautiful and unusual animals. " +
                "They are the tallest land animals in the world. " +
                "Giraffes can reach a height of 5,5 m and a weight of 900 kg. " +
                "They are famous for their long necks. But does anybody know, " +
                "that giraffes have a very long tongue? " +
                "They even can clean the ears with it! Giraffes are usually yellow or light brown with dark stains");

        System.out.println(textMonitoring.toString());

        System.out.println(textMonitoring.getCountUniqueWords());

        System.out.println(textMonitoring.getUniqueWords());

        System.out.println(textMonitoring.getFrequencyWord("long"));

        System.out.println(textMonitoring.getFrequencyWords(false));

        System.out.println(textMonitoring.getFrequencyWords(true));
    }
}
