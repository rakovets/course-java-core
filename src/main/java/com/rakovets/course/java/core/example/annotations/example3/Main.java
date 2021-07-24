package com.rakovets.course.java.core.example.annotations.example3;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Class<DemoClass> demoClassObj = DemoClass.class;
        readAnnotationOn(demoClassObj);
        Method method = demoClassObj.getMethod("printString");
        readAnnotationOn(method);
    }

    static void readAnnotationOn(AnnotatedElement element) {
        try {
            System.out.println("\nПоиск аннотаций в " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavaFileInfo) {
                    JavaFileInfo fileInfo = (JavaFileInfo) annotation;
                    System.out.println("Автор: " + fileInfo.name());
                    System.out.println("Версия: " + fileInfo.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
