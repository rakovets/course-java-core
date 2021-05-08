package com.rakovets.course.java.core.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Number utils.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
public abstract class NumberUtil {
    /**
     * Rounds the value to two digits for the mantissa.
     *
     * @param value start value
     * @return rounded value
     */
    public static double roundValueToTwoDigitsForMantissa(double value) {
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Rounds the value to two digits for the mantissa.
     *
     * @param value start value
     * @return rounded value
     */
    public static float roundValueToTwoDigitsForMantissa(float value) {
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).floatValue();
    }
}
