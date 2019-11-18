package com.rakovets.course.challenge.oop.inheritance;

/*## Project: `Cat's home`
### Specification of task 1
Создать класс `Cat`.

Поля:
- `name` – кличка кота

Конструкторы:
- `Cat(name)` – принимает кличку кота

Методы:
- `mew()` – кот мяукает
- `purr()` – кот мурлычет
- `getName()` – получить кличку кота
- `setName(name)` – задать кличку кота
*/
class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }


    public void mew() {
        System.out.println("Mew-mew");
    }

    public void mew(Person person) {
        mew();
        person.takeHappiness(-5);
    }

    public void purr() {
        System.out.println("Purr-purr");
    }

    public void purr(Person person) {
        purr();
        person.takeHappiness(5.0);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Cat name: " + name);
    }

}
