package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask10 {
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
		Task10.main(new String[]{"176", "90"});
		assertEquals("24", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task10.main(new String[]{"158", "34"});
		assertEquals("-14", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task10.main(new String[]{"180", "70"});
		assertEquals("0", ConsoleReader.getConsoleContent());
	}
}
