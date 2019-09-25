package com.rakovets.course.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleReader {
	private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	public static PrintStream getEmptyOutPrintStream() {
		outContent.reset();
		return new PrintStream(outContent);
	}

	public static String getConsoleContent() {
		return outContent.toString().trim();
	}
}
