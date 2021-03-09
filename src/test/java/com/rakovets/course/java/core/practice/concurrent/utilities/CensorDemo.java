package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.censor.Censor;

public class CensorDemo {
    public static void main(String[] args) {
        String forbiddenSource = "src/main/resources/censor_data/forbidden_words/forbidden_words.txt";
        String censoredDataPath = "src/main/resources/censor_data/censored_data.txt";
        String path = "src/main/resources/censor_data";
        Censor censor = new Censor(forbiddenSource, censoredDataPath);
        censor.check(3);
    }
}
