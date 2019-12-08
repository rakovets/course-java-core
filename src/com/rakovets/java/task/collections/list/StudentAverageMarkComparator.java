package com.rakovets.java.task.collections.list;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		if (a.getAverageAnnualMark() > b.getAverageAnnualMark())
			return 1;
		else if (a.getAverageAnnualMark() < b.getAverageAnnualMark())
			return -1;
		else
			return 0;
	}
}
