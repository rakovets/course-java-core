package com.rakovets.course.java.core.example.annotations.example3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JavaFileInfo {
    String name() default "no name";
    String value() default "0.0";
}
