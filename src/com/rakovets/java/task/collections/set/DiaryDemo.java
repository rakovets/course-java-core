package com.rakovets.java.task.collections.set;

import java.text.SimpleDateFormat;
import java.util.*;

public class DiaryDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> diary = new HashMap();
		Scanner scannerNumbers = new Scanner(System.in);
		Scanner scannerText = new Scanner(System.in);
		SimpleDateFormat calendar = new SimpleDateFormat("dd MMMM yyy \n");
		System.out.printf("\nСегодня: %s", calendar.format(new Date()));
		boolean run = true;
		while (run) {
			System.out.print("\n\n1. Добавить запись за сегодняшний день.\n2. Проверить есть ли запись за определенный день.\n" +
					"3. Показать запись за определенный день.\n4. Обновить запись за определенный день. \n" +
					"5. Удалить запись за определенный день.\n6. Показать содержимое. \n7. Выйти из приложения.\n\n" +
					"Введите номер пункта: ");
			int operation = scannerNumbers.nextInt();
			switch (operation) {
				case 1:
					System.out.print("Введите дату записи: ");
					int data1 = scannerNumbers.nextInt();
					if (dataСhecking(data1)) {
						break;
					}
					if (diary.containsKey(data1)) {
						System.out.printf("Запись на %d число уже существует!\n", data1);
					} else {
						System.out.print("Введите запись: ");
						String text1 = scannerText.nextLine();
						diary.put(data1, text1);
						System.out.printf("Запись на %d число добавлена!", data1);
					}
					break;
				case 2:
					System.out.print("Введите дату записи: ");
					int data2 = scannerNumbers.nextInt();
					if (dataСhecking(data2)) {
						break;
					}
					if (diary.containsKey(data2)) {
						System.out.printf("Есть запись на %d число.", data2);
					} else {
						System.out.printf("Нет записи на %d число.", data2);
					}
					break;
				case 3:
					System.out.print("Введите дату записи: ");
					int data3 = scannerNumbers.nextInt();
					if (dataСhecking(data3)) {
						break;
					}
					if (diary.containsKey(data3)) {
						System.out.printf("Запись на %d число: \"%s\"", data3, diary.get(data3));
					} else {
						System.out.printf("Запись на %d число отсутствует!", data3);
					}
					break;
				case 4:
					System.out.print("Введите дату записи: ");
					int data4 = scannerNumbers.nextInt();
					if (dataСhecking(data4)) {
						break;
					}
					if (diary.containsKey(data4)) {
						System.out.printf("Предыдущая запись на %d число: \"%s\"", data4, diary.get(data4));
						diary.remove(data4);
					} else {
						System.out.printf("Запись на %d число отсутствует!", data4);
					}
					System.out.print("\nВведите новую запись: ");
					String text2 = scannerText.nextLine();
					diary.put(data4, text2);
					System.out.printf("Запись на %d число обновлена!", data4);
					break;
				case 5:
					System.out.print("Введите дату записи: ");
					int data5 = scannerNumbers.nextInt();
					if (dataСhecking(data5)) {
						break;
					}
					if (!diary.containsKey(data5) || diary.get(data5) == null) {
						System.out.printf("Запись на %d число отсутствует!", data5);
					} else {
						System.out.printf("Запись на %d число \"%s\" удалена!", data5, diary.get(data5));
						diary.remove(data5);
					}
					break;
				case 6:
					System.out.println("Содержимое дневника: ");
					for (Map.Entry<Integer, String> unit : diary.entrySet()) {
						System.out.printf("Число \"%d\" Запись \"%s\"\n", unit.getKey(), unit.getValue());
					}
					break;
				case 7:
					run = false;
					System.out.println("THE END");
					break;
				default:
					System.out.println("Enter 0 - 6 !!!");
			}
		}
	}

	static boolean dataСhecking(int data) {
		boolean check = false;
		if (data > 31 || data < 1) {
			System.out.println("Введите РЕАЛЬНУЮ дату месяца :)");
			check = true;
		}
		return check;
	}
}