package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.concurrent.ExecutionException;

public class ExeptionsLesson extend Throwable{



    public void getString(String var){
        throw new NullPointerException();
        String forExeption = "Please check" + var;
                 System.out.print(forExeption);
        }




}
