package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для парсера информации о персонале компании
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		String text = INPUT_SCANNER.next();

		// Вызов методов
		parseToArrayName(text);
		parseToArraySurname(text);
		parseToArraySalary(text);
	}

	/**
	 * Возвращает массив имен персонала
	 * @param text строка, которая содержит всю информацию
	 * @return массив имен персонала, где каждый элемент ~ имя одного сотрудника
	 */
	static String[] parseToArrayName(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		return null;
	}

	/**
	 * Возвращает массив фамилий персонала
	 * @param text строка, которая содержит всю информацию
	 * @return массив фамилий персонала, где каждый элемент ~ фамилия одного сотрудника
	 */
	static String[] parseToArraySurname(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		return null;
	}

	/**
	 * Возвращает массив зарплат персонала
	 * @param text строка, которая содержит всю информацию
	 * @return массив зарплат персонала, где каждый элемент ~ зарплата одного сотрудника
	 */
	static int[] parseToArraySalary(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		return null;
	}
}