package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task06;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.isEmptyException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.IsTheTriggerPulledException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.IsTheShutterMovedException;


public class Demo06 {
    public static void main(String[] args) {
        Task06 task06 = new Task06();
        int countOfBullets = 0;
        boolean isTriggerPulled = true;
        boolean isShutterMoved = true;
        String result;
        try {
            result = task06.shotFire(countOfBullets, isShutterMoved, isTriggerPulled);
        } catch (IsTheTriggerPulledException | IsTheShutterMovedException e) {
            result = e.getMessage();
        } catch (isEmptyException e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        System.out.println(result);
    }
}
