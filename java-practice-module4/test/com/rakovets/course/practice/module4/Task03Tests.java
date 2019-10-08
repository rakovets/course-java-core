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
class Task03Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of(new String[]{"10000.0", "18.0", "5"}, "22877.58"),
				Arguments.of(new String[]{"10000.0", "50.0", "9"}, "384433.59"),
				Arguments.of(new String[]{"10000.0", "7.0", "7"}, "16057.81"),
				Arguments.of(new String[]{"10000.0", "4.0", "8"}, "13685.69"),
				Arguments.of(new String[]{"10000.0", "1.0", "10"}, "11046.22"),
				Arguments.of(new String[]{"10000.0", "3.0", "15"}, "15579.67")
		);
	}

	@ParameterizedTest(name = "Deposit info: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Deposit")
	void test(String[] position, String expected) {
		Task03.main(position);
		assertEquals(getConsoleContentWithTrim(), expected);
	}
}