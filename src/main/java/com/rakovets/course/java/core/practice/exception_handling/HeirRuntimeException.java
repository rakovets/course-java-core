package com.rakovets.course.java.core.practice.exception_handling;

public class HeirRuntimeException  extends RuntimeException {
    private String cat;
    public HeirRuntimeException(String cat) {
        this.cat= cat;
    }

    public String toString() {
        return "Cat " + cat + " not found";
    }
}


