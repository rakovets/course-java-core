package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;

public class Demo7 {
    public static final Logger logger = Logger.getLogger(Demo7.class.getName());
    public static void main(String[] args) {
        try {
            new Task7().gameCasino(1000);
        } catch (WinningBetException e) {
            logger.info(e.getMessage());
        } finally {
            logger.info("Game results");
        }
    }
}
