package com.rakovets.course.challenge.oop.inheritance;

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
     public void mew() {
         System.out.print("Siamese: ");
         super.mew();
     }

     @Override
     public void mew(Person person) {
         System.out.print("Siamese: ");
         super.mew();
         person.takeHappiness(-15);
     }

     @Override
     public void purr() {
         System.out.print("Siamese: ");
         super.purr();
     }

     @Override
     public void purr(Person person) {
         System.out.print("Siamese: ");
         super.purr();
         person.takeHappiness(15);
     }
}

