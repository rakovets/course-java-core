package com.rakovets.course.java.core.practice.lambda_expressions.MathStat;

public interface Randomizer {
    /**
     * Get random value
     * @param bound offset for value
     * @param core start value for randomizing
     * @return random value
     */
    int getRandomValue(int bound, int core);
}
