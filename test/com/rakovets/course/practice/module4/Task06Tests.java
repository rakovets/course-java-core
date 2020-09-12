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
class Task06Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of("13524624562456", "13 524 624 562 456"),
				Arguments.of("-92346234", "-92 346 234"),
				Arguments.of("123456453456", "123 456 453 456"),
				Arguments.of("-834563456234", "-834 563 456 234")
		);
	}

	@ParameterizedTest(name = "Count rows: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Generator rows of table")
	void test(String position, String expected) {
		Task06.main(new String[]{position});
		assertEquals(getConsoleContentTrim(), expected);
	}
}