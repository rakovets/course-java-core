package com.rakovets.course.examples.module2.util;

public class TypeSize {
	public static void main(String[] args) {
		String template = "%s\n  size = %d bits\n  min = %,d max = %,d\n";
		System.out.printf(template, Byte.class.getName(), Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf(template, Short.class.getName(), Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf(template, Short.class.getName(), Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		System.out.printf(template, Integer.class.getName(), Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf(template, Long.class.getName(), Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		template = "%s\n  size = %d bits\n  min = %f max = %f\n";
		System.out.printf(template, Float.class.getName(), Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf(template, Double.class.getName(), Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
	}
}
