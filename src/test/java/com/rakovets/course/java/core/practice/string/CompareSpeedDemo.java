package com.rakovets.course.java.core.practice.string;

import java.util.Date;

public class CompareSpeedDemo {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        long[] results = stringUtil.compareSpeed("as");

        System.out.println("String concantination " + results[0] + "\nStringBuilder concantination "  + results[1]);

    }
}
