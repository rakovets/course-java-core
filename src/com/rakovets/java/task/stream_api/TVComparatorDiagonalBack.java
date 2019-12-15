package com.rakovets.java.task.stream_api;

import java.util.Comparator;

public class TVComparatorDiagonalBack implements Comparator<TV> {
	public int compare(TV a, TV b) {
		return b.getDiagonal().toUpperCase().compareTo(a.getDiagonal().toUpperCase());
	}
}