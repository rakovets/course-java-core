package com.rakovets.course.util.school;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		double diff = o1.getAverageAnnualMark() - o2.getAverageAnnualMark();
		return diff > 0 ? (int) Math.ceil(diff) : (int) Math.floor(diff);
	}
}
