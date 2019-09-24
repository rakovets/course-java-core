
package com.rakovets.course.practice.module2;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask11 {
	@BeforeEach
	void setUpStreams() {
		System.setOut(ConsoleReader.getEmptyOutPrintStream());
	}

	@AfterEach
	void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	void test0() {
		Task11.main(new String[]{"-273.15"});
		assertEquals("Celsius -273.15° - Kelvin 0.0° - Fahrenheit -459.66999999999996°", ConsoleReader.getConsoleContent());
	}

	@Test
	void test1() {
		Task11.main(new String[]{"-17.78"});
		assertEquals("Celsius -17.78° - Kelvin 255.36999999999998° - Fahrenheit -0.0040000000000048885°", ConsoleReader.getConsoleContent());
	}

	@Test
	void test2() {
		Task11.main(new String[]{"0"});
		assertEquals("Celsius 0.0° - Kelvin 273.15° - Fahrenheit 32.0°", ConsoleReader.getConsoleContent());
	}

	@Test
	void test3() {
		Task11.main(new String[]{"36.8"});
		assertEquals("Celsius 36.8° - Kelvin 309.95° - Fahrenheit 98.24°", ConsoleReader.getConsoleContent());
	}

	@Test
	void test4() {
		Task11.main(new String[]{"5526.0"});
		assertEquals("Celsius 5526.0° - Kelvin 5799.15° - Fahrenheit 9978.800000000001°", ConsoleReader.getConsoleContent());
	}
}