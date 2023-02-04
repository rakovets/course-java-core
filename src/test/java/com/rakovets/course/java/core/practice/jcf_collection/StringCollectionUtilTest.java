package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;


public class StringCollectionUtilTest {
    private StringCollectionUtil collectionUtil;
    private Collection<String > testCollection;
    private Collection<String> collection;

    @BeforeEach
    public void init() {
        collectionUtil = new StringCollectionUtil();
        testCollection = new ArrayList<>(Arrays.asList("sweet", "dreams", "are", "made", "of", "this"));
    }

    @Test
    public void resetWordsByLengthTest1() {
        collection = collectionUtil.resetWordsByLength(testCollection, 4);

      //  collection.stream().filter(s -> set2.contains(s)).collect(Collectors.toSet());



    }

}
