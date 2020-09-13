package com.rakovets.java.practice.lambda;

import java.util.UUID;

public class Student {
    public class IdentityCard {
        String id;
        String university;

        public IdentityCard(String id, String university) {
            this.id = id;
            this.university = university;
        }

        public IdentityCard() {

        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUniversity() {
            return university;
        }

        public void setUniversity(String university) {
            this.university = university;
        }
    }

    private int age;
    private String fullName;

    private IdentityCard identityCard;

    public Student(int age, String fullName, IdentityCard identityCard) {
        this.age = age;
        this.fullName = fullName;
        this.identityCard = identityCard;
    }

    public Student(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
        this.identityCard = new IdentityCard(UUID.randomUUID().toString(), "BSU");
    }

    public void payOrder(int avoidMonths) {
        class Order {
            int amount;

            public Order(int amount) {
                this.amount = amount;
            }
        }
        Order order = new Order(1000);

        if (avoidMonths != 0) {
            order.amount += avoidMonths * 5;
        }
        System.out.println("Student pays the order! " + order.amount);
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
