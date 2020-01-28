package com.rakovets.course.util.school;

public class Student {
	private String name;
	private String surname;
	private int age;
	private double averageAnnualMark;

	public Student(String name, String surname, int age, double averageAnnualMark) {
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

	public double getAverageAnnualMark() {
		return averageAnnualMark;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", age=" + age +
				", averageAnnualMark=" + averageAnnualMark +
				'}';
	}
}
