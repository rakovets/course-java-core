package com.rakovets.course.java.core.practice.exception_handling;

public class IllegalArgumentsForParserException extends RuntimeException {
    private String advice;

    public IllegalArgumentsForParserException(String message, String advice) {
        super(message);
        this.advice = advice;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
