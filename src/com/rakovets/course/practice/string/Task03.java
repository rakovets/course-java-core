package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разработать программу для парсера информации о персонале компании.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
	/**
	 * Запрашивает ввод данных от пользователя и вызывает все методы класса для этих данных.
	 */
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		System.out.println("Enter information with format: 'Name Surname Salary; ...;'");
		String text = INPUT_SCANNER.nextLine();

		// Вызов методов
		System.out.println(Arrays.toString(parseToArrayName(text)));
		System.out.println(Arrays.toString(parseToArraySurname(text)));
		System.out.println(Arrays.toString(parseToArraySalary(text)));
	}

	/**
	 * Возвращает массив имен персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив имен персонала, где каждый элемент ~ имя одного сотрудника
	 */
	static String[] parseToArrayName(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String[] employersInformation = getEmployersInformationArray(text);
		String[] answer = new String[employersInformation.length];
		for (int i = 0; i < employersInformation.length; i++){
			answer[i] = employersInformation[i].split(" ")[0];
		}
		return answer;
	}

	/**
	 * Возвращает массив фамилий персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив фамилий персонала, где каждый элемент ~ фамилия одного сотрудника
	 */
	static String[] parseToArraySurname(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String[] employersInformation = getEmployersInformationArray(text);
		String[] answer = new String[employersInformation.length];
		for (int i = 0; i < employersInformation.length; i++){
			answer[i] = employersInformation[i].split(" ")[1];
		}
		return answer;
	}

	/**
	 * Возвращает массив зарплат персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив зарплат персонала, где каждый элемент ~ зарплата одного сотрудника
	 */
	static int[] parseToArraySalary(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String[] employersInformation = getEmployersInformationArray(text);
		int[] answer = new int[employersInformation.length];
		for (int i = 0; i < employersInformation.length; i++){
			answer[i] = Integer.parseInt(employersInformation[i].split(" ")[2]);
		}
		return answer;
	}

	/**
	 * Возвращает массив строк с информацией о сотрудниках
	 * @param text строка, содержащая необработаную информацию о всех сотрудниках
	 * @return массив строк с информацией о сотрудниках
	 */
	private static String[] getEmployersInformationArray(String text) {
		Pattern p = Pattern.compile("[A-Z][a-zA-Z\\u002D]*?\\s+[A-Z][a-zA-Z\\u002D]*?\\s+\\d+");
		Matcher m = p.matcher(text);
		ArrayList<String> list = new ArrayList<>();
		while (m.find()){
			list.add(text.substring(m.start(), m.end()).replaceAll("\\s{2,}", " "));
		}
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
}