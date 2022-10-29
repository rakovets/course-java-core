package com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1;

import java.util.Map;

@FunctionalInterface
public interface MapToArrayString {
    public String[] transferToMap(Map<String, String> map);
}
