package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task7 {

    public double throwExceptionFiftyPercent(double random) throws FileNotFoundException {
        if (random >= 0 && random <= 0.5) {
            throw new FileNotFoundException("This is FileNotFoundException");
        }
        return random;
    }
}











/*

= Specification of task 7

* написать метод, который в 50% случаев бросает исключение
* вызвать этот метод в конструкции `try ... catch ... finally`
* протестировать работу блока `finally`


 */
