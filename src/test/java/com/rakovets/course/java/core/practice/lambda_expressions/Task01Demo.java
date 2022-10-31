package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;

public class Task01Demo {
    public static final Logger logger = Logger.getLogger(Task01.class.getName());

    public static void main(String[] args) {
        Task01 task01 = new Task01();
        String[] array = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> map = Map.of("-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt");

        logger.info(task01.convertArrayInMap(array).toString());
        logger.info(Arrays.toString(task01.convertMapInArray(map)));
    }
}
