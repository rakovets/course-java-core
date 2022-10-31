package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.task_01.ArgumentsConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_01_Tests {
    String[] arrayArguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
    ArgumentsConverter argumentsConverter = new ArgumentsConverter();

    @Test
    public void testConvertArgumentsToMap() {
        Map<String, String> mapArguments = argumentsConverter.convertArgumentsToMap(arrayArguments);
        List<String> stringList = mapArguments.values().stream().collect(Collectors.toList());
        String[] arrayStringsFromMap = new String[stringList.size()];
        stringList.toArray(arrayStringsFromMap);
        String stringActual = String.join("", arrayStringsFromMap);
        String stringExpected = String.join("", arrayArguments);

        Assertions.assertEquals(stringExpected, stringActual);
    }

    @Test
    public void testConvertArgumentsFromMap() {
        Map<String, String> mapArguments = argumentsConverter.convertArgumentsToMap(arrayArguments);
        String[] stringArrayFromMap = argumentsConverter.convertArgumentsFromMap(mapArguments);
        String stringActual = String.join("", stringArrayFromMap);
        String stringExpected = String.join("", arrayArguments);

        Assertions.assertEquals(stringExpected, stringActual);
    }
}
