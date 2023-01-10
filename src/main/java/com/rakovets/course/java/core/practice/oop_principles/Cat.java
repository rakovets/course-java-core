package com.rakovets.course.java.core.practice.oop_principles;

public class Cat {
   private String name;

   public Cat(String name) {
       this.name = name;
   }

   public String mew() {
       return "meow...meow...meow";
   }

   public String purr() {
       return "purr...purr...purr";
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

}
