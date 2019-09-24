package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestTask01 {
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
		Task01.main(new String[]{"2", "2"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task01.main(new String[]{"9", "1"});
		assertEquals("9", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task01.main(new String[]{"5", "2"});
		assertEquals("2", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task01.main(new String[]{"20", "50"});
		assertEquals("0", ConsoleReader.getConsoleContent());
	}
}