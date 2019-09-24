package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class TestTask04 {
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
		Task04.main(new String[]{"3"});
		assertEquals("1.7320508075688772", ConsoleReader.getConsoleContent(), "quoter root 3");
	}

	@Test
	void test2() {
		Task04.main(new String[]{"9"});
		assertEquals("3.0", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task04.main(new String[]{"256"});
		assertEquals("16.0", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task04.main(new String[]{"-3"});
		assertEquals("NaN", ConsoleReader.getConsoleContent());
	}
}