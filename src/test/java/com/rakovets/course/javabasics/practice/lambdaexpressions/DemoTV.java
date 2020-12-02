package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.TV;
import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.UtilityTV;

import java.util.ArrayList;

public class DemoTV {
    public static void main(String[] args) {
        ArrayList<TV> listOfTV = new ArrayList<>();

        listOfTV.add(new TV("Xiaomi Corporation","Xiaomi MI TV ",2019,43,400.00));
        listOfTV.add(new TV("Holding Horizon"," Horizont 32LE5511D",2018,32,150.00));
        listOfTV.add(new TV("ASSEMBLEON","Thomson T43USM7020",2020,43,320.00));
        listOfTV.add(new TV("Samsung Electronics","Samsung QE55Q70TAU",2020,55,1130.00));

        UtilityTV utilityTV = new UtilityTV();
        System.out.println(utilityTV.getTVWithGivenDiagonal(listOfTV,43));
        System.out.println(utilityTV.getTVWithGivenManufacturer(listOfTV,"Samsung Electronics"));
        System.out.println(utilityTV.getTVNotOlderThanGivenYearOfIssue(listOfTV,2020));
        System.out.println(utilityTV.getTVWithGivenPrice(listOfTV,100.00,500.00));
        System.out.println(utilityTV.getTVSortedByAscendingPrice(listOfTV));
        System.out.println(utilityTV.getTVSortedByDescendingPrice(listOfTV));
        System.out.println(utilityTV.getTVSortedByAscendingDiagonal(listOfTV));
        System.out.println(utilityTV.getTVSortedByDescendingDiagonal(listOfTV));
    }
}
