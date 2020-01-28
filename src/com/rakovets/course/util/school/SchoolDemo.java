package com.rakovets.course.util.school;

import java.util.ArrayList;
import java.util.List;

public class SchoolDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student("1", "First", 20, 4.6));
		list.add(new Student("2", "Second", 23, 5));
		list.add(new Student("3", "Third", 18, 3.8));
		list.add(new Student("4", "Fours", 28, 2.2));
		list.add(new Student("5", "Fives", 25, 4.8));

		System.out.println(list);

		System.out.println(SchoolUtil.getBestStudent(list));

		list.sort(new StudentAgeComparator());

		System.out.println(list);
	}
}
