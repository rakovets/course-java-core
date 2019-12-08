package com.rakovets.java.task.collections.list;

import java.util.*;

public class TextMonitoring {
	static List<String> singleWords(String text) {
		return new ArrayList(Arrays.asList(text.split("\\s*(\\s|,|:|!|\\.)\\s*")));
	}

	static void researchText(String text) {
		List<String> wordsArrayList = new ArrayList(singleWords(text));
		System.out.printf("\n%s", wordsArrayList);
		System.out.printf("\nКоличество различных слов в тексте - %d\n", wordsArrayList.size());
		Set<String> wordsHashSet = new HashSet(wordsArrayList);
		System.out.println("\nЧастота с которой встречаются различные слова (считаются различными даже если у них отличается регистр букв): ");
		for (String unit1 : wordsHashSet) {
			int counter = 0;
			for (String unit2 : wordsArrayList) {
				if (unit1.equals(unit2)) {
					counter++;
				}
			}
			System.out.printf("%-8s - %d pc\n", unit1, counter);
		}
	}

	static int getCountUniqueWords(String text) {
		Set<String> wordsHashSet = new HashSet(singleWords(text));
		return wordsHashSet.size();
	}

	static Set<String> getUniqueWords(String text) {
		Set<String> wordsHashSet = new HashSet(singleWords(text));
		return wordsHashSet;
	}

	static int get(String text, String word) {
		List<String> wordsArrayList = new ArrayList(singleWords(text));
		int counter = 0;
		for (String unit1 : wordsArrayList) {
			if (unit1.equals(word)) {
				counter++;
			}
		}
		return counter;
	}

	static void print(String text) {
		List<String> wordsArrayList = new ArrayList(singleWords(text));
		System.out.printf("\n%s", wordsArrayList);
		Set<String> wordsHashSet = new HashSet(wordsArrayList);
		System.out.println("\nЧастота употребления слов (в порядке убывания частоты): ");
		TreeMap<String, Integer> frequencyWords = new TreeMap();
		for (String unit1 : wordsHashSet) {
			int counter = 0;
			for (String unit2 : wordsArrayList) {
				if (unit1.equals(unit2)) {
					counter++;
				}
			}
			frequencyWords.put(unit1, counter);
		}
		TextComparatorFrequency comp = new TextComparatorFrequency();
		frequencyWords.entrySet().stream().sorted(comp).forEach(System.out::println);
	}
}
