package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

 class Persian extends Cat{

     Persian (String name){
         super(name);
     }

     @Override
     public String mew() {
         return "Moa-Moa-Moa";
     }

     @Override
     public String purr() {
         return "Prrrr_Prrrr-Prrrsss";
     }
}
