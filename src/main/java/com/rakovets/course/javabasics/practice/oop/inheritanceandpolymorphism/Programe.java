package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class ProgramCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("");
        System.out.println(cat1.getName());

        cat1.setName("Dusya");

        System.out.println("Name of Cat :" + cat1.getName() + "\n" +
                " Cat do like " + cat1.mew() + " and " + cat1.purr());

        Siamese cat2 = new Siamese("");
        cat2.setName("Siamse");
        cat2.setColor("brown");
        System.out.println("Name of Cat :" + cat2.getName() + "\n" + "Siamese do like "
                + cat2.mew() + " and " + cat2.purr() + "\n and has " + cat2.getColor() + " color");

        Persian cat3 = new Persian("");
        cat3.setName("Persian");
        System.out.println("Name of Cat :" + cat3.getName() + "\n" + "Persian do like "
                + cat3.mew() + " and " + cat3.purr());


    }
}
