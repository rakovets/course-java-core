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
class Task09Tests extends ConsoleTest {
	static Stream<Arguments> testArgumentsProvider() {
		return Stream.of(
				Arguments.of(new String[]{"100.0", "5", "5", "20", "1.0"}, "5 - 100.0 with sell 0.0%\n10 - 198.0 with sell 1.0%\n15 - 294.0 with sell 2.0%\n20 - 388.0 with sell 3.0%\n25 - 480.0 with sell 4.0%\n30 - 570.0 with sell 5.0%\n35 - 658.0 with sell 6.0%\n40 - 744.0 with sell 7.0%\n45 - 828.0 with sell 8.0%\n50 - 910.0 with sell 9.0%\n55 - 990.0 with sell 10.0%\n60 - 1068.0 with sell 11.0%\n65 - 1144.0 with sell 12.0%\n70 - 1218.0 with sell 13.0%\n75 - 1290.0 with sell 14.0%\n80 - 1360.0 with sell 15.0%\n85 - 1428.0 with sell 16.0%\n90 - 1494.0 with sell 17.0%\n95 - 1558.0000000000002 with sell 18.0%\n100 - 1620.0 with sell 19.0%"),
				Arguments.of(new String[]{"10.0", "5", "1", "50", "1.0"}, "5 - 10.0 with sell 0.0%\n6 - 11.879999999999999 with sell 1.0%\n7 - 13.719999999999999 with sell 2.0%\n8 - 15.52 with sell 3.0%\n9 - 17.28 with sell 4.0%\n10 - 19.0 with sell 5.0%\n11 - 20.68 with sell 6.0%\n12 - 22.32 with sell 7.0%\n13 - 23.92 with sell 8.0%\n14 - 25.48 with sell 9.0%\n15 - 27.0 with sell 10.0%\n16 - 28.48 with sell 11.0%\n17 - 29.92 with sell 12.0%\n18 - 31.32 with sell 13.0%\n19 - 32.68 with sell 14.0%\n20 - 34.0 with sell 15.0%\n21 - 35.28 with sell 16.0%\n22 - 36.519999999999996 with sell 17.0%\n23 - 37.720000000000006 with sell 18.0%\n24 - 38.88 with sell 19.0%\n25 - 40.0 with sell 20.0%\n26 - 41.08 with sell 21.0%\n27 - 42.120000000000005 with sell 22.0%\n28 - 43.120000000000005 with sell 23.0%\n29 - 44.08 with sell 24.0%\n30 - 45.0 with sell 25.0%\n31 - 45.88 with sell 26.0%\n32 - 46.72 with sell 27.0%\n33 - 47.519999999999996 with sell 28.0%\n34 - 48.28 with sell 29.0%\n35 - 49.0 with sell 30.0%\n36 - 49.67999999999999 with sell 31.0%\n37 - 50.31999999999999 with sell 32.0%\n38 - 50.919999999999995 with sell 33.0%\n39 - 51.48 with sell 34.0%\n40 - 52.0 with sell 35.0%\n41 - 52.480000000000004 with sell 36.0%\n42 - 52.92 with sell 37.0%\n43 - 53.32 with sell 38.0%\n44 - 53.68 with sell 39.0%\n45 - 54.0 with sell 40.0%\n46 - 54.28000000000001 with sell 41.0%\n47 - 54.52000000000001 with sell 42.0%\n48 - 54.720000000000006 with sell 43.0%\n49 - 54.88 with sell 44.0%\n50 - 55.00000000000001 with sell 45.0%\n51 - 55.080000000000005 with sell 46.0%\n52 - 55.120000000000005 with sell 47.0%\n53 - 55.120000000000005 with sell 48.0%\n54 - 55.08 with sell 49.0%"),
				Arguments.of(new String[]{"1.15", "100", "1", "5", "1.0"}, "100 - 1.15 with sell 0.0%\n101 - 1.149885 with sell 1.0%\n102 - 1.1495399999999998 with sell 2.0%\n103 - 1.1489649999999998 with sell 3.0%\n104 - 1.1481599999999998 with sell 4.0%"),
				Arguments.of(new String[]{"10.0", "34", "1", "5", "1.0"}, "34 - 10.0 with sell 0.0%\n35 - 10.191176470588236 with sell 1.0%\n36 - 10.376470588235293 with sell 2.0%\n37 - 10.555882352941177 with sell 3.0%\n38 - 10.729411764705882 with sell 4.0%"),
				Arguments.of(new String[]{"11.0", "5", "4", "8", "1.0"}, "5 - 11.0 with sell 0.0%\n9 - 19.602 with sell 1.0%\n13 - 28.028000000000002 with sell 2.0%\n17 - 36.278000000000006 with sell 3.0%\n21 - 44.352000000000004 with sell 4.0%\n25 - 52.25 with sell 5.0%\n29 - 59.972 with sell 6.0%\n33 - 67.518 with sell 7.0%"),
				Arguments.of(new String[]{"1.7", "5", "7", "3", "1.0"}, "5 - 1.7 with sell 0.0%\n12 - 4.0392 with sell 1.0%\n19 - 6.3308 with sell 2.0%")
		);
	}

	@ParameterizedTest(name = "Price info: {0}")
	@MethodSource("testArgumentsProvider")
	@DisplayName("Hypermarket prices with sell")
	void test(String[] position, String expected) {
		Task09.main(position);
		assertEquals(getConsoleContentTrim(), expected);
	}
}