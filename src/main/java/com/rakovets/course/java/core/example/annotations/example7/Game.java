package com.rakovets.course.java.core.example.annotations.example7;

import java.lang.annotation.Repeatable;

@Repeatable(Games.class)
@interface Game {
    String name() default "Что-то под вопросом";

    String day();
}
