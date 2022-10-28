package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {
    public void shareOrange (int person, int partsOfOrange) throws ReminderOfOrange {
        if (person == 0) {
            throw new RuntimeException("Никто не хочет апельсин");
        }
        if (partsOfOrange % person != 0) {
            throw new ReminderOfOrange("Осталось еще немного апельсина");
        }
    }
}
