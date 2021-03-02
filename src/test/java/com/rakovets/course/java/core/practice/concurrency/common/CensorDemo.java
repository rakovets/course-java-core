package com.rakovets.course.java.core.practice.concurrency.common;

import com.rakovets.course.java.core.practice.concurrency.common.censor.Censor;

public class CensorDemo {
    public static void main(String[] args) {
        String forbiddenSource = "src/main/resources/practice/censors_data_directory/forbidden_words/forbidden.txt";
        String censoredDataPath = "src/main/resources/practice/censors_data_directory/censored_data.txt";
        String path = "src/main/resources/practice/censors_data_directory";
        Censor censor = new Censor(forbiddenSource, censoredDataPath);
        censor.check();
    }
}
