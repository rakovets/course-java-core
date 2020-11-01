package com.rakovets.course.javabasics.util;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class StandardOutputUtil {
    public static void println(String string,  AnsiColorCode... codes) {
        String color = Arrays.stream(codes).map(String::valueOf).collect(Collectors.joining());
        System.out.printf("%s%s%s\n", color, string, AnsiColorCode.RESET);
    }
}
