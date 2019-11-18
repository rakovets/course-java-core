package com.rakovets.course.challenge.oop.inheritance;

public class PersonTests {
    public static void main(String[] args) {
        Person oleg = new Person (25.5);
        oleg.displayInfo();
        System.out.println("Добавляем счастья 30.5 пунктов");
        oleg.takeHappiness(30.5);
        oleg.displayInfo();
        System.out.println("Добавляем печали 100 пунктов");
        oleg.takeHappiness(-100.0);
        oleg.displayInfo();
        System.out.println("Устанавливаем новый уровень СУПЕР счастья в 1000 пунктов");
        oleg.setHappiness(1000);
        oleg.displayInfo();
//        System.out.println("\nПроверка мурлыкает или мяучит");
//        person.Cat.mew();
    }

}
