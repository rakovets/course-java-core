package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        FileAnalyzeUtil.replaceModifiers("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/replace-modifiers.txt", "public", "static");
    }
}
