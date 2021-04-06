package com.rakovets.course.java.core.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class NumberUtil {
    public static double roundValueToTwoDigitsForMantissa(double value) {
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static float roundValueToTwoDigitsForMantissa(float value) {
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).floatValue();
    }
}
