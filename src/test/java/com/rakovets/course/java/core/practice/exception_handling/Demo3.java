package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task3.CatFeels;
import com.rakovets.course.java.core.practice.exception_handling.task3.CatFeelsSoGoodException;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo3 {
    public static final Logger logger = Logger.getLogger(Demo3.class.getName());

    public static void main(String[] args) {
        {
            CatFeels cat = new CatFeels("Garfild");
            cat.eats();
            cat.isDrinking();
            try {
                cat.good();
            } catch (CatFeelsSoGoodException ex) {
                logger.log(Level.SEVERE, "Cat feels so good? " + cat.catEats + " " + cat.catIsDrinking + " " + cat.catIsSleeping);
                logger.log(Level.SEVERE, "ERROR " + ex.getMessage());
                logger.log(Level.WARNING, "StackTrace " + Arrays.toString(ex.getStackTrace()));
                logger.info("Program end");
            }
        }
    }
}
