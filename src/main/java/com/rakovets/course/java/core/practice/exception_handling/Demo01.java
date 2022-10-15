package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;
import java.util.logging.Level;

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
            logger.warning(e.getMessage());
            if (e.getMessage() == null) {
                logger.warning(e.toString());
                logger.log(Level.SEVERE, "Null pointer Exception in method");
                logger.info("В методе не задано имя, с которым сравнивается длина данного имени");
            }
            e.printStackTrace();
        }
    }
}
