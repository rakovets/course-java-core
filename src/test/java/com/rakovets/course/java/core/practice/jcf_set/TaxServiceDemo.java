package com.rakovets.course.java.core.practice.jcf_set;

public class TaxServiceDemo {
    public static void main(String[] args) {
        TaxService taxService = new TaxService(10);

        Fine pdd = new Fine(100, "PDD");
        Fine alcohol = new Fine(250, "alcohol");

        Person ivan = new Person("Ivan", "Ivanov", 1, "Minsk", pdd);
        Person petr = new Person("Petr", "Petrov", 2, "Minsk", alcohol);
        Person sveta = new Person("Sveta", "Svetikova", 3, "Brest", pdd);

        taxService.data.add(ivan);
        taxService.data.add(petr);
        taxService.data.add(sveta);

        System.out.println("Print out the base.");
        taxService.printDataBase(taxService);

        System.out.println("\n" + taxService.getNewFine(ivan, alcohol));
        System.out.println("\n" + taxService.penaltyRemoval(ivan, alcohol));
        System.out.println("\n" + taxService.penaltyRemoval(ivan, pdd));
        System.out.println("\n" + taxService.changeInfoByPerson(ivan, 4, "Maksim", "Maksimov",
                "Grodno"));

        System.out.println("\n" + taxService.changeFine(sveta, pdd, alcohol));
    }
}
