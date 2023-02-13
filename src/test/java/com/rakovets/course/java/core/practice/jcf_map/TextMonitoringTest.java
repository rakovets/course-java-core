package com.rakovets.course.java.core.practice.jcf_map;

public class TextMonitoringTest {
    public static void main(String[] args) {
        String str = "My heart is filled with joy every time I think of you, my love. My days are brighter and my nights are more peaceful since you came into my life. My dearest, you are the reason why I wake up with a smile on my face each morning and why I go to bed feeling grateful every night.\n" +
                "\n" +
                "My friends are always amazed by the happiness that you bring into my life. They can see the change in my behavior and my attitude since you became a part of my world. My love, you make me feel like a new person, full of energy and positivity. My soul sings with joy every time I think of you.";
        System.out.println(TextMonitoring.researchText(str));
        System.out.println(TextMonitoring.getCountUniqueWords(str));
        System.out.println(TextMonitoring.getUniqueWords(str));
        System.out.println(TextMonitoring.getFrequencyWord(str,"My"));
        System.out.println(TextMonitoring.getFrequencyWords(str,false));
        System.out.println(TextMonitoring.getFrequencyWords(str,true));
    }
}
