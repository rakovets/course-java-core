package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }
        public String mew() {
            return "Meew";
        }

        public String purr () {
            return "Purrr";
        }

    public String mew(Person user) {
        user.changeHappiness(-15);
        return "Mew-mew";
    }

    public String purr(Person user) {
        user.changeHappiness(15);
        return "Purr-purr";
    }
}

