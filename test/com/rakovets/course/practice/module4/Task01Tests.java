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
class Task01Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of("13", "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13"),
				Arguments.of("9", "1\n2\n3\n4\n5\n6\n7\n8\n9"),
				Arguments.of("12", "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12"),
				Arguments.of("8", "1\n2\n3\n4\n5\n6\n7\n8")
		);
	}

	@ParameterizedTest(name = "Count rows: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Generator rows of table")
	void test(String position, String expected) {
		Task01.main(new String[]{position});
		assertEquals(getConsoleContentTrim(), expected);
	}
}