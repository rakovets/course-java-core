package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask04;

import java.util.logging.Logger;

public class Demo04 {
    public static void main(String[] args) {
        Task04 currentAccount = new Task04();
        try {
            currentAccount.openAccount(180, 15);
        } catch (MyExceptionTask04 e) {
            Logger logger = Logger.getLogger(Demo04.class.getName());
            logger.warning(e.toString());
            e.printStackTrace();
        }
    }
}
