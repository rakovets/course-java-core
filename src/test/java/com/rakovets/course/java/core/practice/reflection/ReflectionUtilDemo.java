package com.rakovets.course.java.core.practice.reflection;

import java.util.Arrays;

public class ReflectionUtilDemo {
    public static void main(String[] args) {
        User oleg = new User(10);
        Class<User> olegClass = User.class;
        User olga = new User(11);
        System.out.println(ReflectionUtils.getField(olegClass,"id"));
        System.out.println(ReflectionUtils.getMethod(olegClass,"getId"));
        System.out.println(Arrays.toString(ReflectionUtils.getAllMethod(olegClass)));
        ReflectionUtils.invokedMethod(ReflectionUtils.getMethod(olegClass,"getId"),oleg);
        ReflectionUtils.setField((ReflectionUtils.getField(olegClass,"id")),oleg,13);
        System.out.println(oleg.toString());
    }
}
