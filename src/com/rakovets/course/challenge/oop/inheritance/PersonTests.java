package com.rakovets.course.challenge.oop.inheritance;

public class PersonTests {
    public static void main(String[] args) {
        Person person = new Person (25.5);
        person.displayInfo();
        System.out.println("Добавляем счастья 30.5 пунктов");
        person.takeHappiness(30.5);
        person.displayInfo();
        System.out.println("Добавляем печали 100 пунктов");
        person.takeHappiness(-100.0);
        person.displayInfo();
        System.out.println("Устанавливаем новый уровень СУПЕР счастья в 1000 пунктов");
        person.setHappiness(1000);
        person.displayInfo();
//        System.out.println("\nПроверка мурлыкает или мяучит");
//        person.Cat.mew();
    }

}
