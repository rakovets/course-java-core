package com.rakovets.course.java.core.practice.jcf_map;

import static java.lang.System.*;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText("KEY key value VALUE! key value KEY KEY VALUE! VALUE");

        out.println("\nGetting all unique words.\n" + textMonitoring.getUniqueWords());

        out.println("\nWe get all unique words and their number of repetitions.\n" + "Sort from smallest to largest.\n"
                + textMonitoring.getFrequencyWords(true));

        out.println("\nWe get all unique words and their number of repetitions.\n" + "Sort from largest to smallest\n"
                + textMonitoring.getFrequencyWords(false));
    }
}
