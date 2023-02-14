package com.rakovets.course.java.core.practice.jcf_set;

public class TaxServiceDemo {
    public static void main(String[] args) {
        Person person1 = new Person("1115", "Pual Chedvick", "Minsk");
        person1.addPenaltyType(Penalty.APARTMENT);
        person1.addPenaltyType(Penalty.PRIVATE_HOUSE);

        Person person2 = new Person("2115", "Kate Middleton", "Minsk");
        person2.addPenaltyType(Penalty.INCOME);
        Person person3 = new Person("1111", "Debra Wilson", "Minsk");
        person3.addPenaltyType(Penalty.CAR);

        TaxService service = new TaxService();
        service.addToBase(person1);
        service.addToBase(person2);
        service.addToBase(person3);
        service.showAllInfo();
        person1.addPenaltyType(Penalty.CAR);
        person1.removePenaltyType(Penalty.PRIVATE_HOUSE);
        System.out.println();
        service.showAllInfo();

    }
}
