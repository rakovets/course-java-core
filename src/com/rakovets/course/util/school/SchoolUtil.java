package com.rakovets.course.util.school;

import java.util.List;

public class SchoolUtil {
	public static Student getBestStudent(List<Student> list) {
		list.sort(new StudentAverageMarkComparator().reversed());
		return list.get(0);
	}
}
