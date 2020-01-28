package com.rakovets.course.util.hollywood;

import java.util.ArrayList;

public class HollywoodDemo {
	public static void main(String[] args) {
		ArrayList<Actor> list = new ArrayList<>();

		list.add(new Actor("First", "1", 43, 50000));
		list.add(new Actor("Second", "2", 27, 45000));
		list.add(new Actor("Third", "3", 81, 45000));
		list.add(new Actor("Fours", "4", 43, 1000));
		list.add(new Actor("Fives", "5", 18, 640000));

		System.out.println(list);

		Actor.fire(list);

		System.out.println(list);

		list.sort(new ActorFeeComparator().thenComparing(new ActorLastNameComparator()));

		System.out.println(list);
	}
}
