package com.rakovets.java.task.collections.list;

public class TextMonitoringDemo {
	public static void main(String[] args) {
		String text = "British people are fond of watching TV. Most families watch TV more than 4 hours a day." +
				" word, word, word, word, word. Add, Add, Add, Add, ADD, ADD. TV, TV.";
		TextMonitoring.researchText(text);
		System.out.printf("\nКоличество уникальных слов в тексте - %d\n", TextMonitoring.getCountUniqueWords(text));
		System.out.printf("Уникальные слова из текста - %s\n", TextMonitoring.getUniqueWords(text));
		String word = "word";
		System.out.printf("Частота употребления слова <%s>: %d pc\n", word, TextMonitoring.get(text, word));
		TextMonitoring.print(text);
	}
}
