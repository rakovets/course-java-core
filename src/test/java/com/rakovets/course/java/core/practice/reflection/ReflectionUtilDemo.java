package com.rakovets.course.java.core.practice.reflection;

import java.util.Arrays;

public class ReflectionUtilDemo {
    public static void main(String[] args) {
        User user = new User(13);
        Class<User> userClass = User.class;

        System.out.println(ReflectionUtil.getField(userClass, "field"));
        System.out.println(ReflectionUtil.getMethod(userClass,"getField"));
        System.out.println(Arrays.toString(ReflectionUtil.getAllMethods(userClass)));
        ReflectionUtil.callMethod(ReflectionUtil.getMethod(userClass, "getField"), user);
    }
}
