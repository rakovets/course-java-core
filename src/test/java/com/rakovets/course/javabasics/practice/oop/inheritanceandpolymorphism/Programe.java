package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class ProgramCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("");
        System.out.println(cat1.getName());

        cat1.setName("Dusya");

    //    System.out.println("Name of Cat :" + cat1.getName() + "\n" +
    //            " Cat do like " + cat1.mew() + " and " + cat1.purr());
        Siamese cat2 = new Siamese("");
        cat2.setName("Siamse");
        cat2.setColor("brown");
     //   System.out.println("Name of Cat :" + cat2.getName() + "\n" + "Siamese do like "
      //          + cat2.mew() + " and " + cat2.purr() + "\n and has " + cat2.getColor() + " color");
        Persian cat3 = new Persian("");
        cat3.setName("Persian");
     //   System.out.println("Name of Cat :" + cat3.getName() + "\n" + "Persian do like "
     //           + cat3.mew() + " and " + cat3.purr());
        Person human = new Person(76);
        cat2.mew(human);
        System.out.println(cat2.getName() + " did " + cat2.mew() + "  " + "and happines of human = " + human.getHappiness() + "%");
        cat2.purr(human);
        System.out.println(cat2.getName() + " did " + cat2.purr() + "  " + "and happines of human = " + human.getHappiness() + "%");
        Sphynx cat4 = new Sphynx("Tutanhamon");
        cat4.mew(human);
        System.out.println(cat4.getName() + " did " + cat4.mew() + "  " + "and happines of human = " + human.getHappiness() + "%");
        cat4.purr(human);
        System.out.println(cat4.getName() + " did " + cat4.purr() + "  " + "and happines of human = " + human.getHappiness() + "%");

    }
}
