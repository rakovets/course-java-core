package com.rakovets.course.java.core.practice.exception_handling;

import java.util.ArrayList;
    public class Task04 {
        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();

            arrayList.add("Persian");
            arrayList.add("Sphynx");
            arrayList.add("Siamese");
            String cat = "Siamese";

            if (!arrayList.contains(cat))
                try {
                    throw new HeirRuntimeException(cat);
                } catch (HeirRuntimeException e) {
                    e.printStackTrace();
                }
            else System.out.println(cat);
        }
    }


