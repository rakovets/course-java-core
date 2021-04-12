package com.rakovets.course.java.core.practice.string;

public class StringUtil {


    public  static  void main(String[] args) {
        String str1 = " privet";
        String str2 = " Andrei ";
        String symbol = "W";
        String task01 = str1.concat(str2);
        System.out.println(task01);
        int task02 = task01.indexOf(symbol);
        System.out.println(task02);
        boolean task03 = str1.equals(str2);
        System.out.println(task03);
        String task04 = task01.trim().toUpperCase();
        System.out.println(task04);
    }
}
