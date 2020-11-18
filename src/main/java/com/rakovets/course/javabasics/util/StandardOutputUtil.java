package com.rakovets.course.javabasics.util;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class StandardOutputUtil {
    public static void println(Object string, AnsiColorCode... codes) {
        System.out.printf("%s%s%s\n", getAnsiColor(codes), string, AnsiColorCode.RESET);
    }

    public static void printlnWithTime(Object string, AnsiColorCode... codes) {
        System.out.printf("%s%s - %s%s\n", getAnsiColor(codes), LocalDateTime.now(), string, AnsiColorCode.RESET);
    }

    public static void printlnWithTimeAndThread(Object string, AnsiColorCode... codes) {
        System.out.printf("%s%s - %s - %s%s\n", getAnsiColor(codes), LocalDateTime.now(), Thread.currentThread().getName(), string, AnsiColorCode.RESET);
    }

    private static String getAnsiColor(AnsiColorCode... codes) {
        return Arrays.stream(codes).map(String::valueOf).collect(Collectors.joining());
    }
}
