package com.rakovets.course.challenge.CatSolution;

public class CatTests {
    public static void main(String[] args) {
        Cat catsBehavior = new Cat ("Tom");
        catsBehavior.mew();
        catsBehavior.purr();
        catsBehavior.setName("Eugene");
        System.out.println(catsBehavior.getName());
    }
}
