package com.rakovets.course.practice.module4;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 * @version 1.0
 */
class Task07Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of(new String[]{"13", "20", "5.0"}, "143.35"),
				Arguments.of(new String[]{"20", "42", "4.0"}, "553.42"),
				Arguments.of(new String[]{"5", "10", "10.0"}, "57.18"),
				Arguments.of(new String[]{"1", "20", "1.0"}, "1918.62"),
				Arguments.of(new String[]{"0", "20", "5.0"}, "0.00")
		);
	}

	@ParameterizedTest(name = "Count rows and is table header: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Generator rows of table (improve)")
	void test(String[] position, String expected) {
		Task07.main(position);
		assertEquals(getConsoleContentTrim(), expected);
	}
}