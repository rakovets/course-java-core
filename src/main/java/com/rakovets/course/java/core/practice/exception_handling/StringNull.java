package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Locale;

public class StringNull {
    public String str;

    public StringNull() {
        this.str = str;
    }

    public String anyMethod(String str) {
        str = null;
        return str.toLowerCase(Locale.ROOT);
    }
}
