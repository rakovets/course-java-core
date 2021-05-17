package com.rakovets.course.java.core.practice.concurrency;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UsedPaths {
    private final Path consumerWorkResult = Paths.get("src/main/java/com/rakovets/course/java/core/practice/" +
            "concurrency/consumerWorkResult");

    public Path getPathToConsumerWorkResult() {
        return consumerWorkResult;
    }
}
