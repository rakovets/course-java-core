package com.rakovets.course.javabasics.example.lambdaexpressions.streamapi.model;

public class Student {
    private String firstname;
    private String lastname;
    private Integer age;
    private Integer fee;

    public Student(String firstname, String lastname, Integer age, Integer fee) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.fee = fee;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"firstname\":\"" + firstname + "\",\n" +
                "  \"lastname\":\"" + lastname + "\",\n" +
                "  \"age\":" + age + ",\n" +
                "  \"fee\":" + fee + "\n" +
                "}";
    }
}
