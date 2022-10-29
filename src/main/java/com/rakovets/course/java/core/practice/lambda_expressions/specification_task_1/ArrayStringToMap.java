package com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1;

import java.util.Map;

@FunctionalInterface
public interface ArrayStringToMap {
    public Map<String, String> transfer(String[] text);
}
