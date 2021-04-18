package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeptions.ThirdExeption;

public class Task5Demo {
    public static void main(String[] args) throws ThirdExeption {
        try {
            int result = Task5.areaOf(0);
        } catch (NullPointerException ex) {
            if(ex.getMessage().equals("value cannot be zero")){
                try {
                    int result2 = Task5.exeptionFor(0);
                }
                catch (ThirdExeption e){
                    System.out.println(e.getMessage());
                }

            }
        }
    }
}
