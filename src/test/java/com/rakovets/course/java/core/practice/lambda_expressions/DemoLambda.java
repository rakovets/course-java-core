package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.tv.ProjectTV;
import com.rakovets.course.java.core.practice.lambda_expressions.tv.Television;

import java.util.*;

public class DemoLambda {
    public static void main(String[] args) {
        String[] lines = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Task1 task1 = new Task1();
        Map<String, String> map = task1.convertArrayToMap(lines);
        System.out.println(map);
        System.out.println("------------------TASK1----------------------------");
        String[] linesConvert = task1.convertMapToArray(map);
        System.out.println(Arrays.toString(task1.convertMapToArray(map)));
        System.out.println("------------------TASK2----------------------------");
        Task2 task2 = new Task2();
        task2.tableInOneColumn();
        System.out.println("---------------------------------------------------");
        task2.tableInFiveColumn();
        System.out.println("-------------MathsStatistics-----------------------");
        MathsStatistics math = new MathsStatistics();
        List<Integer> list = MathsStatistics.random();
        System.out.println(list);
        System.out.println(math.getEvenNumbers(list));
        System.out.println(math.getOddNumbers(list));
        System.out.println(math.getNumbersNull(list));
        System.out.println(math.getNumbers(list,2));
        System.out.println("-------------CityHelper-----------------------");
        CityHelper city =  new CityHelper(Arrays.asList("Minsk", "New-York", "Antalya", "Oslo", "Batumi", "Vilnius", "Dublin", "Oslo", "Minsk"));
        System.out.println(city.getUniqueCities());
        System.out.println(city.getNameCityLength());
        System.out.println(city.getNameFirstLetter('M'));
        System.out.println(city.getCountNameCity("Minsk"));
        System.out.println("-------------ProjectTV-----------------------");
        List<Television> tv = new ArrayList<>(List.of(
                new Television("LG", "NanoCell", 2022, 50, 2027.4 ),
                new Television("Xiaomi MI", "P1", 2021, 50, 1420.0),
                new Television("Sumsung", "UE32T5300AU",2020, 32, 1151.30),
                new Television("Sony", "XR-55X9OJ", 2022, 55, 2800.0)
        ));
        ProjectTV television = new ProjectTV(tv);
        System.out.println(television.getListDiagonal(50));
        System.out.println(television.getListManufacturer("LG"));
        System.out.println(television.getListLessThanYear(2022));
        System.out.println(television.getListPriceRange(1300, 1700));
        System.out.println(television.getListSortedByPriceAscending());
        System.out.println(television.getListSortedByPriceDescending());
        System.out.println(television.getListSortedByDiagonalAscending());
        System.out.println(television.getListSortedByDiagonalDescending());
    }
}
