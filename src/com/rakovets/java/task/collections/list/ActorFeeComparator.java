package com.rakovets.java.task.collections.list;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {
	public int compare(Actor a, Actor b) {
		if (a.getFee() > b.getFee())
			return 1;
		else if (a.getFee() < b.getFee())
			return -1;
		else
			return 0;
	}
}
