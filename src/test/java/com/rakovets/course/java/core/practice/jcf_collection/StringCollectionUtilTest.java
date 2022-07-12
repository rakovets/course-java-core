package com.rakovets.course.java.core.practice.jcf_collection;

import com.sun.nio.sctp.AssociationChangeNotification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringCollectionUtilTest {
    StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
    List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
    List<String> listChanged =  new ArrayList<>(Arrays.asList("*", "is", "*", "of", "fun", "for", "every", "*", "programmer"));

    @Test
    public void testResetWordsByLength() {
        Assertions.assertEquals(listChanged, (stringCollectionUtil.resetWordsByLength(list, 4)));
    }

    Collection<String> collection = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
    Collection<String> collectionChanged = new ArrayList<>(Arrays.asList("is", "of", "fun", "for", "every", "programmer"));

    @Test
    public void testRemoveWordsByLength() {
        Assertions.assertEquals(collectionChanged, stringCollectionUtil.removeWordsByLength(collection, 4));
    }
    }
