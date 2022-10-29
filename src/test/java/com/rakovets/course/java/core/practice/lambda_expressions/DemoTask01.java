package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1.ArrayStringToMap;
import com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1.MapToArrayString;
import com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1.ToArrayString;
import com.rakovets.course.java.core.practice.lambda_expressions.specification_task_1.ToMap;

import java.util.Arrays;
import java.util.Map;

public class DemoTask01 {
    public static void main(String[] args) {
        ToMap toMap = new ToMap();
        String[] text1 = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        ArrayStringToMap arrayStringToMap = (text) -> toMap.methodArrayStringToMAp(text1);
        Map<String, String> map = arrayStringToMap.transfer(text1);
        System.out.println(map + "\n");

        ToArrayString toArrayString = new ToArrayString();
        MapToArrayString mapToArrayString = (map1) -> toArrayString.methodMapToStringArray(map);
        String[] strings = mapToArrayString.transferToMap(map);
        System.out.println(Arrays.toString(strings));
    }
}
