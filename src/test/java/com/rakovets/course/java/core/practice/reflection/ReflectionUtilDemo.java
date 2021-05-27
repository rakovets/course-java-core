package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

public class ReflectionUtilDemo {
    public static void main(String[] args) {
        Model model = new Model("Tokamo", 22);
        ReflectionUtils.getFieldFromObject("name", model);
    }
}
