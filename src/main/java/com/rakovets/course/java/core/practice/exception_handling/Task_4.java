package com.rakovets.course.java.core.practice.exception_handling;

import java.util.ArrayList;

public class Task_4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Penthouse");
        arrayList.add("Townhouse");
        String house = "House";

        if (!arrayList.contains(house))
            try {
                throw new ArrayException(house);
            } catch (ArrayException e) {
                e.printStackTrace();
            }
        else System.out.println(house);
    }
}
