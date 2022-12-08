package com.rakovets.course.java.core.practice.jcf_list.school_class;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private double averageAnnualMark;

    public Person(String name, String surname, int age, double averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public void setAverageAnnualMark(double averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }

    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        result = prime * result + surname.hashCode();
        result = prime * result + age;
        result = prime * result + (int) averageAnnualMark;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.getAge())
            return false;
        if (averageAnnualMark != other.getAverageAnnualMark())
            return false;
        if (!name.equals(other.name))
            return false;
        if (!surname.equals(other.surname))
            return false;
        return true;
    }
}
