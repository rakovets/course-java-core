package com.rakovets.course.java.core.practice.exception_handling;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task4 {
    static class RotationFrequency {
        public static double getRotationFrequency(double speed, double diameter) {
            final double PI = 3.14;

            if (diameter < 0) {
                throw new Task4.IllegalRotationValueException("The diameter is less than 0!!!");
            }
            double result = (1000 * speed) / (PI * diameter);
            return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
    }

    static class IllegalRotationValueException extends RuntimeException {
        public IllegalRotationValueException(String message) {
            super(message);
        }
    }
}

