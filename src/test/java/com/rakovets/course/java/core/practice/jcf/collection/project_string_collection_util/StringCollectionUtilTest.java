package com.rakovets.course.java.core.practice.jcf.collection.project_string_collection_util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

class StringCollectionUtilTest {

    @Test
    void resetWordsByLenght() {
        //Given
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("task");
        arrayList.add("audi");
        arrayList.add("jawa");
        String expectedResult = "*";

        //When
        stringCollectionUtil.resetWordsByLenght(arrayList,4);

        //Than
        Assertions.assertEquals(expectedResult, arrayList.get(1));
        Assertions.assertEquals(expectedResult, arrayList.get(2));
        Assertions.assertEquals(expectedResult, arrayList.get(3));

    }

    @Test
    void removeWordsByLenght() {
        //Given
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        Collection<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("task");
        collection.add("audi");
        collection.add("jawa");
        collection.add("quattro");

        //When
        stringCollectionUtil.removeWordsByLenght(collection,4);

        //Than
        Assertions.assertEquals(2, collection.size());
    }
}
