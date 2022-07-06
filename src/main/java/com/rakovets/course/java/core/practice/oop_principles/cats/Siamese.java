package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Siamese extends Cat {
        public Siamese(String name) {
            super(name);
        }

        @Override
        protected String catMeows() {
            return "meow";
        }

        @Override
        protected double catMeows(Person user) {
        return user.changeHappiness(-5);
        }

        @Override
        protected String catPurrs() {
            return "purr";
        }

        @Override
        protected double catPurrs(Person user) {
        return user.changeHappiness(+15);
    }
}
