package com.rakovets.course.java.core.practice.reflection;

public class ReflectionUtilDemo {
    public static void main(String[] args) {
        String name = "name";
        Model model = new Model("Tokamo");
        Class<Model> modelClass = Model.class;
        try {
            System.out.println(ReflectionUtils.getFieldFromObject(name, modelClass));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
