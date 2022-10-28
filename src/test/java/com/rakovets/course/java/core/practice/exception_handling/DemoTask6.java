package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask6 {
    public static final Logger logger = Logger.getLogger(DemoTask6.class.getName());

    public static void main(String[] args) {
        Task6 task = new Task6();
        try {
            task.getAverageMarkForExams(new String[] {"", "3", "Н", "Пересдача", "5"});
        } catch (MissExamException | FailExamException e) {
            logger.info("Назначить дату нового экзамена");
        } catch (NullStringException e) {
            logger.info(e.getMessage());
        }
    }
}
