package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {
    public void gameCasino (int winning) throws WinningBetException {
        if (winning == 0) {
            throw new RuntimeException("Ваша ставка не сыграла");
        }
        if (winning > 0) {
            throw new WinningBetException("Luck smiled at you");
        }
    }
}
