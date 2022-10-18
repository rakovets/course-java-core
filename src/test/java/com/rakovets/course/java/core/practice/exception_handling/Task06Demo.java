package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask06CollarIsPutOn;
import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask06LeashIsPutOn;
import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask06MuzzleIsPutOn;

import java.util.Arrays;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.logger;

public class Task06Demo {
    public static void main(String[] args) {
        Task06Dog dog = new Task06Dog("Dog", true, true, false);

        try {
            dog.checkReadinessDogForWalk();
        } catch (ExceptionTask06CollarIsPutOn | ExceptionTask06LeashIsPutOn exception) {
            exception.printStackTrace();
        } catch (ExceptionTask06MuzzleIsPutOn exception) {
            logger.info("StackTrace: " + Arrays.toString(exception.getStackTrace()));
        }
    }
}
