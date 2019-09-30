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
class Task02Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of(new String[]{"13", "false"}, "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13"),
				Arguments.of(new String[]{"9", "false"}, "1\n2\n3\n4\n5\n6\n7\n8\n9"),
				Arguments.of(new String[]{"13", "true"}, "\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12"),
				Arguments.of(new String[]{"9", "true"}, "\n1\n2\n3\n4\n5\n6\n7\n8")
		);
	}

	@ParameterizedTest(name = "Count rows and is table header: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Generator rows of table (improve)")
	void test(String[] position, String expected) {
		Task02.main(position);
		assertEquals(getConsoleContentTrim(), expected);
	}
}