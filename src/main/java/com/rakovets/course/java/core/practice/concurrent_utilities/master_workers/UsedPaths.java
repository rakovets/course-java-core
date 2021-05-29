package com.rakovets.course.java.core.practice.concurrent_utilities.master_workers;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UsedPaths {
    private final Path workerWorkResult = Paths.get("src", "main", "resources", "practice", "workerWorkResult");

    public Path getPathToWorkerWorkResult() {
        return workerWorkResult;
    }
}
