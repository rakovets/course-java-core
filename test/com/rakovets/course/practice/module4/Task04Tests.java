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
class Task04Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of(new String[]{"100", "5.0", "10.0"}, "162"),
				Arguments.of(new String[]{"100", "0.0", "5.0"}, "100"),
				Arguments.of(new String[]{"100", "-5.0", "0.0"}, "100"),
				Arguments.of(new String[]{"100", "-4.0", "6.0"}, "78"),
				Arguments.of(new String[]{"100", "100.0", "0.0"}, "100"),
				Arguments.of(new String[]{"100", "25.0", "5.0"}, "305")
		);
	}

	@ParameterizedTest(name = "Raid Boss info: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Raid Boss Monitoring")
	void test(String[] position, String expected) {
		Task04.main(position);
		assertEquals(getConsoleContentWithTrim(), expected);
	}
}