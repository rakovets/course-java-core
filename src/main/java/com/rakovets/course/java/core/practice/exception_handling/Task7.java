package com.rakovets.course.java.core.practice.exception_handling;

import java.net.SocketException;

public class Task7 {
    public void getException(int variant) throws SocketException {
        int[] arr = new int[3];
        switch (variant) {
            case 1:
                throw new SocketException("Just SocketException");
            case 2:
                arr[4] = 10;
                break;
        }
    }
}
