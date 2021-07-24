package com.rakovets.course.java.core.example.annotations.example7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Games {
    Game[] value();
}
