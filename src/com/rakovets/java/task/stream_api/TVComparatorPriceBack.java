package com.rakovets.java.task.stream_api;

import java.util.Comparator;

public class TVComparatorPriceBack implements Comparator<TV> {
	public int compare(TV a, TV b) {
		return Integer.compare(b.getPrice(), a.getPrice());
	}
}