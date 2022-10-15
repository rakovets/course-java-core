package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;

import static com.rakovets.course.java.core.practice.exception_handling.Task01.checkNameLength;

public class Demo01 {
    public static void main(String[] args) {
        String name = "Victorlong";
        int counter = 0;
        try {
            if (checkNameLength(name)) {
                counter++;
            }
            System.out.println("Более длинных имен уже " + counter);
            System.out.println("Введите следующее имя для сравнения его длины с заданным именем");
        } catch (Exception e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.severe(e.getMessage());
            if (e.getMessage() == null) {
                logger.info("В методе не задано имя, с которым сравнивается длина данного имени");
            }
        }
    }
}
