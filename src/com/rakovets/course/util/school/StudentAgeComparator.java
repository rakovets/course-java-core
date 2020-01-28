package com.rakovets.course.util.school;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
}
