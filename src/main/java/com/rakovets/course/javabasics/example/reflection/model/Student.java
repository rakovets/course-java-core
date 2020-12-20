package com.rakovets.course.javabasics.example.reflection.model;

@Model
public class Student extends User implements Excludable {
    private Group group;
    private double fee;
    private String nickname;

    public Student(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Student(String firstname, String lastname, Group group) {
        super(firstname, lastname);
        this.group = group;
    }


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private double updateFee(double incrementFee) {
        this.fee += incrementFee;
        return this.fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                ", fee=" + fee +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
