package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestTask02 {
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
		Task02.main(new String[]{"1", "2"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task02.main(new String[]{"2", "1"});
		assertEquals("0", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task02.main(new String[]{"3", "2"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task02.main(new String[]{"-3", "2"});
		assertEquals("-1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test5() {
		Task02.main(new String[]{"-3", "-2"});
		assertEquals("-1", ConsoleReader.getConsoleContent());
	}

	@Test
	void test6() {
		Task02.main(new String[]{"3", "-2"});
		assertEquals("1", ConsoleReader.getConsoleContent());
	}
}