package com.rakovets.java.task.collections.list;

import java.util.Comparator;
import java.util.Map;

public class TextComparatorFrequency implements Comparator<Map.Entry<String, Integer>> {
	public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
		if (a.getValue() < b.getValue())
			return 1;
		else if (a.getValue() > b.getValue())
			return -1;
		else
			return 0;
	}
}
