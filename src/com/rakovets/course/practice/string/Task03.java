package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

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
		String[] employees = text.split(";");
		String[] names = new String[employees.length];
		for (int i = 0; i < employees.length; i++) {
			String empoyl = employees[i];
			int positionspace = empoyl.indexOf(" ");
			String name = empoyl.substring(0, positionspace);
			names[i] = name;
		}
		return names;
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
		while (text.contains("  ")) {
			text = text.replace("  ", " ");
		}
		String[] employees = text.split(";");
		String[] surnames = new String[employees.length];
		for (int i = 0; i < employees.length; i++) {
			String employ2 = employees[i];
			int positionspace = employ2.indexOf(" ");
			String surnameAndSalary = employ2.substring(positionspace + 1);
			int positionSpaseSecond = surnameAndSalary.indexOf(" ");
			String surname = surnameAndSalary.substring(0, positionSpaseSecond);
			surnames[i] = surname;
		}
		return surnames;
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
		while (text.contains("  ")) {
			text = text.replace("  ", " ");
		}
		String[] employees = text.split(";");
		String[] salarys = new String[employees.length];
		for (int i = 0; i < employees.length; i++) {
			String employ3 = employees[i];
			int positionspace = employ3.indexOf(" ");
			String salary = employ3.substring(positionspace + 1);
			salarys[i] = salary;
		}
		return null;
	}
}