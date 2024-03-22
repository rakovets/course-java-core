package com.rakovets.course.java.core.example.annotations.example6;

public @interface Game {
    String name() default "Что-то под вопросом";

    String day();
}
