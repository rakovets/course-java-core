package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class TestTask03 {
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
		Task03.main(new String[]{"1", "2"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task03.main(new String[]{"2", "1"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task03.main(new String[]{"3", "2"});
		assertEquals("2", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task03.main(new String[]{"-3", "2"});
		assertEquals("-3", ConsoleReader.getConsoleContent());
	}

	@Test
	void test5() {
		Task03.main(new String[]{"-3", "-2"});
		assertEquals("-3", ConsoleReader.getConsoleContent());
	}

	@Test
	void test6() {
		Task03.main(new String[]{"3", "-2"});
		assertEquals("-2", ConsoleReader.getConsoleContent());
	}
}