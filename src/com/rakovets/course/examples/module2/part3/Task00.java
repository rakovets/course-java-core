package com.rakovets.course.examples.module2.part3;

/**
 * Символьный тип переменных
 * <p>
 * Смотри UNICODE table по ссылке
 * http://www.tamasoft.co.jp/en/general-info/unicode.html
 */
public class Task00 {
	public static void main(String[] args) {
		char c = 'A'; // символьный тип
		System.out.println(c);

		char cInt = 65; // 65 это код символа A в таблице UNICODE
		System.out.println(cInt);

		// 0041 это код символа A в таблице UNICODE в шестнадцатеричной системе
		char cHex = 0x0041;
		System.out.println(cHex);

		// char это целочисленнный тип
		// с = -1;
	}
}