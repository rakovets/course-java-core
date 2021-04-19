package com.rakovets.course.java.core.practice.looping_statements;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Hypermarket prices with sell")
class Task08Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(5, 100.0, 5, 1.0, 20, "5 - 100.0 with sell 0.0%\n10 - 198.0 with sell 1.0%\n15 - 294.0 with sell 2.0%\n20 - 388.0 with sell 3.0%\n25 - 480.0 with sell 4.0%\n30 - 570.0 with sell 5.0%\n35 - 658.0 with sell 6.0%\n40 - 744.0 with sell 7.0%\n45 - 828.0 with sell 8.0%\n50 - 910.0 with sell 9.0%\n55 - 990.0 with sell 10.0%\n60 - 1068.0 with sell 11.0%\n65 - 1144.0 with sell 12.0%\n70 - 1218.0 with sell 13.0%\n75 - 1290.0 with sell 14.0%\n80 - 1360.0 with sell 15.0%\n85 - 1428.0 with sell 16.0%\n90 - 1494.0 with sell 17.0%\n95 - 1558.0 with sell 18.0%\n100 - 1620.0 with sell 19.0%"),
                Arguments.of(5, 10.0, 1, 1.0, 50, "5 - 10.0 with sell 0.0%\n6 - 11.88 with sell 1.0%\n7 - 13.72 with sell 2.0%\n8 - 15.52 with sell 3.0%\n9 - 17.28 with sell 4.0%\n10 - 19.0 with sell 5.0%\n11 - 20.68 with sell 6.0%\n12 - 22.32 with sell 7.0%\n13 - 23.92 with sell 8.0%\n14 - 25.48 with sell 9.0%\n15 - 27.0 with sell 10.0%\n16 - 28.48 with sell 11.0%\n17 - 29.92 with sell 12.0%\n18 - 31.32 with sell 13.0%\n19 - 32.68 with sell 14.0%\n20 - 34.0 with sell 15.0%\n21 - 35.28 with sell 16.0%\n22 - 36.52 with sell 17.0%\n23 - 37.72 with sell 18.0%\n24 - 38.88 with sell 19.0%\n25 - 40.0 with sell 20.0%\n26 - 41.08 with sell 21.0%\n27 - 42.12 with sell 22.0%\n28 - 43.12 with sell 23.0%\n29 - 44.08 with sell 24.0%\n30 - 45.0 with sell 25.0%\n31 - 45.88 with sell 26.0%\n32 - 46.72 with sell 27.0%\n33 - 47.52 with sell 28.0%\n34 - 48.28 with sell 29.0%\n35 - 49.0 with sell 30.0%\n36 - 49.68 with sell 31.0%\n37 - 50.32 with sell 32.0%\n38 - 50.92 with sell 33.0%\n39 - 51.48 with sell 34.0%\n40 - 52.0 with sell 35.0%\n41 - 52.48 with sell 36.0%\n42 - 52.92 with sell 37.0%\n43 - 53.32 with sell 38.0%\n44 - 53.68 with sell 39.0%\n45 - 54.0 with sell 40.0%\n46 - 54.28 with sell 41.0%\n47 - 54.52 with sell 42.0%\n48 - 54.72 with sell 43.0%\n49 - 54.88 with sell 44.0%\n50 - 55.0 with sell 45.0%\n51 - 55.08 with sell 46.0%\n52 - 55.12 with sell 47.0%\n53 - 55.12 with sell 48.0%\n54 - 55.08 with sell 49.0%"),
                Arguments.of(100, 1.15, 10, 1.0, 5, "100 - 1.15 with sell 0.0%\n110 - 1.25 with sell 1.0%\n120 - 1.35 with sell 2.0%\n130 - 1.45 with sell 3.0%\n140 - 1.55 with sell 4.0%"),
                Arguments.of(34, 10.0, 1, 1.0, 5, "34 - 10.0 with sell 0.0%\n35 - 10.19 with sell 1.0%\n36 - 10.38 with sell 2.0%\n37 - 10.56 with sell 3.0%\n38 - 10.73 with sell 4.0%"),
                Arguments.of(5, 11.0, 4, 1.0, 8, "5 - 11.0 with sell 0.0%\n9 - 19.6 with sell 1.0%\n13 - 28.03 with sell 2.0%\n17 - 36.28 with sell 3.0%\n21 - 44.35 with sell 4.0%\n25 - 52.25 with sell 5.0%\n29 - 59.97 with sell 6.0%\n33 - 67.52 with sell 7.0%"),
                Arguments.of(5, 1.7, 7, 1.0, 3, "5 - 1.7 with sell 0.0%\n12 - 4.04 with sell 1.0%\n19 - 6.33 with sell 2.0%")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int startNumberItems, double startPriceAllItems, int differentialNumberItems, double differentialSell, int sizeTotalPrice, String expected) {
        String actual = Task08.generateTotalPriceList(startNumberItems, startPriceAllItems, differentialNumberItems, differentialSell, sizeTotalPrice);

        assertEquals(expected, actual);
    }
}
