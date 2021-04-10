package com.rakovets.course.java.core.practice.string;

public class newTask {
    public static void main(String[] args) {
        String text = "1";
        int length = 3;
        NewClass.task(text, length);
    }

    public static class NewClass {
        public static void task(String text, int length) {
            String[] array;

            if (text.length() % length == 0) {
                array = new String[text.length() / length];
            } else {
                array = new String[(text.length() / length) + 1];
            }

            int j = 0;
            while (text.length() > 0) {
                //  System.out.println("Ya tut");
                if(text.length() < length){
                    array[j] = text.substring(0,text.length());
                    break;
                }
                array[j] = text.substring(0, length);
                text = text.substring(length, text.length());
                j++;
            }




        }
    }
}

