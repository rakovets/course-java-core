package com.rakovets.course.challenge.oop.inheritance;

/*### Specification of task 2
Создать классы `Siamese`, `Persian`, `Sphynx`.

Переопределить в них метод:
- `purr()` – кот мурлычет (каждый по разному)
- `mew()` – кот мяукает (каждый по разному)
*/

 class Siamese extends Cat {
     private String catBreed;

     public Siamese(String name, String catBreed) {
         super(name);
         this.catBreed = catBreed;
     }
     @Override
     public void displayInfo() {
         super.displayInfo();
//         System.out.println(getName());
         System.out.printf("%s's breed is Siamese \n", getName());
     }

     @Override
     public void purr() {
         System.out.print("Siamese: ");
         super.purr();
     }

     @Override
     public void mew() {
         System.out.print("Siamese: ");
         super.mew();
     }
}