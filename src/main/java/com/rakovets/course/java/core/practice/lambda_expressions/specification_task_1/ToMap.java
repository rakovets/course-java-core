package com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1;

import java.util.HashMap;
import java.util.Map;

public class ToMap {
    public Map<String, String> methodArrayStringToMAp(String[] text) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < text.length; i += 2) {
            map.put(text[i], text[i + 1]);
        }
        return map;
    }
}
