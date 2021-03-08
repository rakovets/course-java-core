package com.rakovets.course.java.core.practice.concurrent.utilities.censor.controller;

import com.rakovets.course.java.core.practice.concurrent.utilities.censor.service.CutterService;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.exceptions.UserDirectoryException;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.service.CutFilesService;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.service.ForbiddenWordsService;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.service.MergeFilesService;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.service.TextService;
import com.rakovets.course.java.core.practice.concurrent.utilities.censor.view.CensorViewConsole;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CensorController {
    public static Path pathToTextFiles;
    public static Path directoryPath;
    private static final Path pathToForbiddenWords;
    private static final File fileOfForbiddenWords;
    private static final Path pathOfMergedFile;
    private static final CensorViewConsole censorViewConsole;

    static {

        directoryPath = Path.of("src", "main", "resources", "text_files");
        pathToForbiddenWords = Paths.get("src", "main", "resources", "ForbiddenWords.txt");
        pathOfMergedFile = Path.of("src", "main", "resources", "MergedFiles.txt");
        fileOfForbiddenWords = new File(String.valueOf(pathToForbiddenWords));
        censorViewConsole = new CensorViewConsole();

    }

    public void start() {
        if (fileOfForbiddenWords.exists()) {
            ForbiddenWordsService.getForbiddenWords(pathToForbiddenWords);
            TextService.getTexts();
            CutterService.setPathOfDirectory(directoryPath);
            File directory = new File(String.valueOf(pathToTextFiles));
            if (directory.exists()) {
                String[] textFiles = directory.list();
                CutFilesService.cutFiles(textFiles);
                MergeFilesService.mergeFiles(pathOfMergedFile);
                censorViewConsole.mergeCompleted();
            } else
                try {
                    throw new UserDirectoryException(pathToTextFiles);
                } catch (UserDirectoryException e) {
                    e.printStackTrace();
                }
        }
    }
}
