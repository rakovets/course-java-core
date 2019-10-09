package com.rakovets.course.util;

import java.util.Arrays;

/**
 * @author Dmitry Rakovets
 * @since 1.0
 */
public abstract class ArrayUtil {
	public static double[] parseToDouble(String s, String spliterator) {
		return Arrays.stream(s.split(spliterator)).mapToDouble(Double::valueOf).toArray();
	}

	public static int[] parseToInt(String s, String spliterator) {
		return Arrays.stream(s.split(spliterator)).mapToInt(Integer::valueOf).toArray();
	}
}
