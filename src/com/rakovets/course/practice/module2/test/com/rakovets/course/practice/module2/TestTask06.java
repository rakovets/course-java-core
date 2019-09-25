package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class TestTask06 {
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
		Task06.main(new String[]{"1501", "7"});
		assertEquals("2026.0", ConsoleReader.getConsoleContent(), "quoter root 3");
	}

	@Test
	void test2() {
		Task06.main(new String[]{"0", "100"});
		assertEquals("0.0", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task06.main(new String[]{"10000", "0"});
		assertEquals("10000.0", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task06.main(new String[]{"100", "100"});
		assertEquals("600.0", ConsoleReader.getConsoleContent());
	}
}