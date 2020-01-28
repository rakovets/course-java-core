package com.rakovets.course.util.string;

import java.util.ArrayList;
import java.util.List;

public class StringListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Inheritance");
		list.add("Apchy");
		list.add("Depends");
		list.add("Ups!");

		System.out.println(list);

		StringList.markWordsWithLength(list, 5);

		System.out.println(list);

		StringList.removeWordsWithLength(list, 5);

		System.out.println(list);
	}
}
