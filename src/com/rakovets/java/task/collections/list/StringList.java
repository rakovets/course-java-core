package com.rakovets.java.task.collections.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringList {
	void markWordsWithLength(LinkedList<String> list, int length) {
		System.out.printf("Длина слова %d символа. \nПервоначальная коллекция: %s", length, Arrays.toString(list.toArray()));
		ListIterator<String> iterator = list.listIterator(list.size() - 1);
		while (iterator.hasPrevious()) {
			String value = iterator.previous();
			if (value.length() == length) {
				iterator.add("*");
			}
		}
		System.out.printf("\nКоллекция после обработки методом: %s", Arrays.toString(list.toArray()));
	}
}
