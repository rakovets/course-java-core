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
class Task08Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of(new String[]{"100.0", "5", "5", "20"}, "5 - 100.0\n10 - 200.0\n15 - 300.0\n20 - 400.0\n25 - 500.0\n30 - 600.0\n35 - 700.0\n40 - 800.0\n45 - 900.0\n50 - 1000.0\n55 - 1100.0\n60 - 1200.0\n65 - 1300.0\n70 - 1400.0\n75 - 1500.0\n80 - 1600.0\n85 - 1700.0\n90 - 1800.0\n95 - 1900.0\n100 - 2000.0"),
				Arguments.of(new String[]{"10.0", "5", "1", "50"}, "5 - 10.0\n6 - 12.0\n7 - 14.0\n8 - 16.0\n9 - 18.0\n10 - 20.0\n11 - 22.0\n12 - 24.0\n13 - 26.0\n14 - 28.0\n15 - 30.0\n16 - 32.0\n17 - 34.0\n18 - 36.0\n19 - 38.0\n20 - 40.0\n21 - 42.0\n22 - 44.0\n23 - 46.0\n24 - 48.0\n25 - 50.0\n26 - 52.0\n27 - 54.0\n28 - 56.0\n29 - 58.0\n30 - 60.0\n31 - 62.0\n32 - 64.0\n33 - 66.0\n34 - 68.0\n35 - 70.0\n36 - 72.0\n37 - 74.0\n38 - 76.0\n39 - 78.0\n40 - 80.0\n41 - 82.0\n42 - 84.0\n43 - 86.0\n44 - 88.0\n45 - 90.0\n46 - 92.0\n47 - 94.0\n48 - 96.0\n49 - 98.0\n50 - 100.0\n51 - 102.0\n52 - 104.0\n53 - 106.0\n54 - 108.0"),
				Arguments.of(new String[]{"1.15", "100", "1", "5"}, "100 - 1.15\n101 - 1.1615\n102 - 1.1729999999999998\n103 - 1.1844999999999999\n104 - 1.196"),
				Arguments.of(new String[]{"10.0", "34", "1", "5"}, "34 - 10.0\n35 - 10.294117647058824\n36 - 10.588235294117647\n37 - 10.882352941176471\n38 - 11.176470588235293"),
				Arguments.of(new String[]{"11.0", "5", "4", "8"}, "5 - 11.0\n9 - 19.8\n13 - 28.6\n17 - 37.400000000000006\n21 - 46.2\n25 - 55.0\n29 - 63.800000000000004\n33 - 72.60000000000001"),
				Arguments.of(new String[]{"1.7", "5", "7", "3"}, "5 - 1.7\n12 - 4.08\n19 - 6.46")
		);
	}

	@ParameterizedTest(name = "Price info: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Hypermarket prices")
	void test(String[] position, String expected) {
		Task08.main(position);
		assertEquals(getConsoleContentTrim(), expected);
	}
}