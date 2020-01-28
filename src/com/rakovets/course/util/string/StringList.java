package com.rakovets.course.util.string;

import java.util.List;

public class StringList {
	public static void markWordsWithLength(List<String> list, int size) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == size) {
				list.add(i, "*");
				i++;
			}
		}
	}

	public static void removeWordsWithLength(List<String> list, int size) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == size) {
				list.remove(i);
				i--;
			}
		}
	}
}

