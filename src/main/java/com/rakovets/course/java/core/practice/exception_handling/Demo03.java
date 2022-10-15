package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask03;

import java.util.logging.Logger;

public class Demo03 {
    public static void main(String[] args) {
        Task03 currentAccount = new Task03(300, 2021);
        int restOfAccountAfterRequest = currentAccount.getAccountAmount();
        try {
            restOfAccountAfterRequest = currentAccount.getRestOfAccountAfterRequest(150, 2022);
        } catch (MyExceptionTask03 e) {
            Logger logger = Logger.getLogger(JavaUtilLogging01.class.getName());
            logger.warning(e.toString());
            logger.warning(e.getDebugMessage());
        }
        System.out.printf("Остаток на счете после снятия с составляет: %d", restOfAccountAfterRequest);
    }
}
