package com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1;

import java.util.Map;

public class ToArrayString {
    public String[] methodMapToStringArray(Map<String, String> map) {
        String[] text = new String[map.size() * 2];
        int i = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            text[i] = entry.getKey();
            text[i + 1] = entry.getValue();
            i += 2;
        }
        return text;
    }
}
