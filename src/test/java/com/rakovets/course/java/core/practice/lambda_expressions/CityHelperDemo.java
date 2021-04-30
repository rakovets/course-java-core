package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.city_helper.CityUtil;
import java.util.Arrays;

public class CityHelperDemo {
    public static void main(String[] args) {
        System.out.println(CityUtil.getUniqueCity(Arrays.asList("Gomel", "Gomel", "Minsk", "Mosk")));
        System.out.println(CityUtil.getParameterSizeCity(Arrays.asList("Gomel", "Gomel", "Minsk", "Mosk"), 6));
        System.out.println(CityUtil.getCityWithFirstCharacter(Arrays.asList("Gomel", "Gomel", "Minsk", "Mosk"), 'G'));
        System.out.println(CityUtil.getAmountCity(Arrays.asList("Gomel", "Gomel", "Minsk", "Mosk"), "Mosk"));
    }
}
