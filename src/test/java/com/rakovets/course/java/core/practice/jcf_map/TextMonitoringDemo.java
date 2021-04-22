package com.rakovets.course.java.core.practice.jcf_map;

import java.util.HashMap;
import java.util.Map;

public class TextMonitoringDemo {
    public static void main(String[] args) {
       TextMonitoring text = new TextMonitoring();
       text.researchText("paul paul paul Paul hello hell");
        System.out.println(text.getTextlist());

    }
}
