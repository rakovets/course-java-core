package com.rakovets.course.java.core.practice.concurrent.utilities.censor.service;

import com.rakovets.course.java.core.practice.concurrent.utilities.censor.controller.CensorController;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.view.CensorViewConsole;

import java.nio.file.Path;
import java.util.Scanner;

public class TextService {
    public static Path pathToDirectory;
    public static String searchWord;
    private static final CensorViewConsole censorViewConsole = new CensorViewConsole();

    static {

        pathToDirectory = Path.of("src", "main", "resources", "text_files");
        searchWord = "Java";

    }

    public static void getTexts() {
        Scanner in = new Scanner(System.in);
        censorViewConsole.pathToDirectory();
        CensorController.pathToTextFiles = Path.of(in.nextLine());
        CutterService.setPath(CensorController.pathToTextFiles);
        censorViewConsole.searchWord();
        String word = in.nextLine();
        if (word.isEmpty())
            word = searchWord;
        CutterService.setWord(word);
    }
}
