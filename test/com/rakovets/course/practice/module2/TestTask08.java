package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask08 {
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
		Task08.main(new String[]{"256", "3"});
		assertEquals("13.581221810508403", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task08.main(new String[]{"3", "1"});
		assertEquals("0.477464829275686", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task08.main(new String[]{"-100", "5"});
		assertEquals("-3.183098861837907", ConsoleReader.getConsoleContent());
	}
}