package com.rakovets.course.java.core.practice.lambda_expressions.task_01;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ArgumentsConverter {
    public Map<String, String> convertArgumentsToMap(String[] arrayArguments) {
        String ARGUMENTS_NAME = "Arg_";
        Map<String, String> mapArguments = new LinkedHashMap<>();
        Stream.of(arrayArguments).forEach(s -> mapArguments.put(ARGUMENTS_NAME + (mapArguments.size() + 1), s));
        return mapArguments;
    }
    public String[] convertArgumentsFromMap(Map<String, String> mapArguments) {
        List<String> listValuesFromMap = new ArrayList<>();
        mapArguments.values()
                .forEach(s -> listValuesFromMap.add(s));
        String[] stringArrayFromMap = new String[listValuesFromMap.size()];
        listValuesFromMap.toArray(stringArrayFromMap);
        return stringArrayFromMap;
    }
}
