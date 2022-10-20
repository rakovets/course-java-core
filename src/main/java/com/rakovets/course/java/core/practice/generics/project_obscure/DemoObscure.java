package com.rakovets.course.java.core.practice.generics.project_obscure;

import java.util.logging.Logger;

public class DemoObscure {
    public static void main(String[] args) throws MyException {
        final String EXCEPTION_MESSAGE_1 = "Object does not present.";
        final String EXCEPTION_MESSAGE_2 = "First create an object.";

        Obscure <Integer> ob = new Obscure<>(null);
        System.out.println(ob.getItem());
        System.out.println(ob.isPresent());
        System.out.println(ob.isEmpty());
        System.out.println(ob.orElse(5));
        try {
            MyException ex = new MyException(EXCEPTION_MESSAGE_1, EXCEPTION_MESSAGE_2);
            System.out.println(ob.orElseThrow(ex));
        } catch (MyException catchEx) {
            Logger logger = Logger.getLogger(JavaUtilLoggingOb.class.getName());
            logger.warning(catchEx.getMessage());
            logger.warning(catchEx.getDebugMessage());
            catchEx.printStackTrace();
        }
        System.out.println(Obscure.of(3).getItem());
        System.out.println(Obscure.empty().getItem());
    }
}
