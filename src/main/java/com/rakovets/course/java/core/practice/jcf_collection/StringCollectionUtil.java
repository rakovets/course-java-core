package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.List;

public class StringCollectionUtil {

    public void resetWordsByLength(final List<String> line, final int sizeWord) {
        line.replaceAll(s -> s.length() == sizeWord ? "*" : s);
    }

    public void removeWordsByLength(Collection<String> line, int sizeWord) {
        line.removeIf(s -> s.length() == sizeWord);
    }
}
