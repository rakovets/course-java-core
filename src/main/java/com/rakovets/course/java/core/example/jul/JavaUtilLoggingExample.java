package com.rakovets.course.java.core.example.jul;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaUtilLoggingExample {
    public static final Logger logger = Logger.getLogger(JavaUtilLoggingExample.class.getName());

    public static void main(String[] args) {
        JavaUtilLoggingExample javaUtilLoggingExample = new JavaUtilLoggingExample();
        javaUtilLoggingExample.printInfoLog();
        javaUtilLoggingExample.printLogWithInfo();
        javaUtilLoggingExample.printLogWithAnotherLevel();
        javaUtilLoggingExample.catchExceptionAndPrintLog();
    }

    public void printLogWithInfo() {
        logger.log(Level.INFO, "Print log with info level");
    }

    public void printInfoLog() {
        logger.info("Print info log");
    }

    public void printLogWithAnotherLevel() {
        logger.severe("Ошибка");
        logger.warning("Предупреждение");
        logger.info("Информация");
        logger.fine("Отладка");
        logger.finer("Отладка с деталями");
        logger.finest("Отладка с огромным количеством деталей");
    }

    public void catchExceptionAndPrintLog() {
        try {
            Files.readAllBytes(Paths.get("/file/does/not/exist"));
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Error message", ex);
        }
    }
}
