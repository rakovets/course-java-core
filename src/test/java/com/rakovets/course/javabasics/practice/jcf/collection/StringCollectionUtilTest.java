package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.example.generics.model.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {
    private Collection<String> collection;
    private Collection<String> collectionNewResetter;
    private Collection<String> collectionNewRemooving;

    @Test
    void replacement() {

        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] test = new String[]{"this", "*", "lots", "*", "fun", "for", "every", "Java", "programmer"};
        collection = new ArrayList<>(Arrays.asList(array));
        collectionNewResetter = new ArrayList<>(Arrays.asList(test));
        Assertions.assertEquals(collectionNewResetter, StringCollectionUtil.resetWordsByLength(collection, 2));
    }

    @Test
    void remove() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] test = new String[]{"this","", "lots","", "fun", "for", "every", "Java", "programmer"};
        collection = new ArrayList<>(Arrays.asList(array));
        collectionNewRemooving = new ArrayList<>(Arrays.asList(test));
        Assertions.assertEquals(collectionNewRemooving, StringCollectionUtil.removeWordsByLength(collection, 2));



    }

}
