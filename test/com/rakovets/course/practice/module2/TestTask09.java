package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask09 {
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
		Task09.main(new String[]{"8"});
		assertEquals("13.581221810508403", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task09.main(new String[]{"0.1"});
		assertEquals("0.477464829275686", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task09.main(new String[]{"0"});
		assertEquals("-3.183098861837907", ConsoleReader.getConsoleContent());
	}
}