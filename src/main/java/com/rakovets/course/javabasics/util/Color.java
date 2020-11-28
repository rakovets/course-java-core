package com.rakovets.course.javabasics.util;

public enum Color {
    RESET("\033[0m"),
    RED("\033[0;31m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    MAGENTA("\033[0;35m"),
    CYAN("\033[0;36m"),
    GREEN("\033[0;32m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
