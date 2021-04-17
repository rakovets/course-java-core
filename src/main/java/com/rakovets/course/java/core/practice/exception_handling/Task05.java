package com.rakovets.course.java.core.practice.exception_handling;


      /* бросить одно из существующих в JDK исключений
        * отловить это исключение
        * выбросить своё собственное, указав в качестве причины сообщение отловленного `Exception`*/


public class Task05 {
    public static void main(String[] args) throws Exception {
        String variableForException = null;
        try {
            System.out.println(variableForException.length());
        } catch (NullPointerException e) {
                throw new Exception("Exception in thread \"main\" java.lang.NullPointerException");
        }
    }}
