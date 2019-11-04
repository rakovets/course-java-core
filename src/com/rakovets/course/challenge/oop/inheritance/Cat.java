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

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

   public String mew() {
       return ("Mew-mew");
   }

    public String purr() {
        return ("Purr-purr");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
