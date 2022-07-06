package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Sphynx extends Cat {
        public Sphynx(String name) {
            super(name);
        }

        @Override
        protected String catMeows() {
            return "MeoW";
        }

        @Override
        protected double catMeows(Person user) {
        return user.changeHappiness(-15);
        }

        @Override
        protected String catPurrs() {
            return "PurR";
        }

        @Override
        protected double catPurrs(Person user) {
        return user.changeHappiness(+20);
    }
}
