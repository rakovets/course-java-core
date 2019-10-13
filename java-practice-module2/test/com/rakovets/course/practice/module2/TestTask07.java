package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask07 {
	@BeforeEach
	void setUpStreams() {
		System.setOut(ConsoleReader.getEmptyOutPrintStream());
	}

	@AfterEach
	void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	void test1() {
		Task07.main(new String[]{"20"});
		assertEquals("314.1592653589793", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task07.main(new String[]{"4"});
		assertEquals("12.566370614359172", ConsoleReader.getConsoleContent());
	}
}