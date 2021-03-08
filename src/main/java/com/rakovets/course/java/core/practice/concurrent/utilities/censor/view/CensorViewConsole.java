package com.rakovets.course.java.core.practice.concurrent.utilities.censor.view;

import com.rakovets.course.java.core.practice.concurrent.utilities.censor.service.TextService;

public class CensorViewConsole implements CensorView {

    public void mergeCompleted() {
        System.out.println("Merging completed");
    }

    public void pathToDirectory() {
        System.out.println("Enter path to directory (" + TextService.pathToDirectory + ")");
    }

    public void searchWord() {
        System.out.println("Enter word you would like to search for (" + TextService.searchWord + ")");
    }
}
