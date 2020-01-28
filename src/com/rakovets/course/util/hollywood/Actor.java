package com.rakovets.course.util.hollywood;

import java.util.List;

public class Actor {
	private String firstName;
	private String lastName;
	private double fee;
	private int age;

	public Actor(String firstName, String lastName, int age, double fee) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.fee = fee;
	}

	public static void fire(List<Actor> list) {
		list.sort(new ActorFeeComparator().reversed());
		list.remove(0);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getFee() {
		return fee;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Actor{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", fee=" + fee +
				", age=" + age +
				'}';
	}
}
