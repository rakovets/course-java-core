package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask12 {
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
		Task12.main(new String[]{"1"});
		assertEquals("0 0:0:1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task12.main(new String[]{"61"});
		assertEquals("0 0:1:1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task12.main(new String[]{"3661"});
		assertEquals("0 1:1:1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task12.main(new String[]{"86401"});
		assertEquals("1 0:0:1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test5() {
		Task12.main(new String[]{"914701"});
		assertEquals("10 14:5:1", ConsoleReader.getConsoleContent());
	}
}
