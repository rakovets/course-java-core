package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask05 {
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
		Task05.main(new String[]{"0.1"});
		assertEquals("0", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task05.main(new String[]{"0.5"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task05.main(new String[]{"1.0"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task05.main(new String[]{"1.2"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test5() {
		Task05.main(new String[]{"1.9"});
		assertEquals("2", ConsoleReader.getConsoleContent());
	}
}