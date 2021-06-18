/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CreateHistogramMap_sortHistogramMap_Test {

    @Test
    void sortHistogramMap_AssertEqualsSortedMap()
    {
        CreateHistogramMap sortMap = new CreateHistogramMap();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Dog", 1);
        expected.put("Difo", 2);
        expected.put("Fido", 3);

        Map<String, Integer> sample = new HashMap<>();
        sample.put("Dog", 1);
        sample.put("Fido", 3);
        sample.put("Difo", 2);

        Map<String, Integer> actual = new HashMap<>();
        actual = sortMap.sortHistogramMap(sample);

        assertEquals(expected,actual);
    }

    @Test
    void sortHistogramMap_AssertEqualsUnSortedMap()
    {
        CreateHistogramMap sortMap = new CreateHistogramMap();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Rabbit", 0);
        expected.put("Dog", 1);
        expected.put("Difo", 2);
        expected.put("Fido", 3);

        Map<String, Integer> sample = new HashMap<>();
        sample.put("Dog", 1);
        sample.put("Fido", 3);
        sample.put("Difo", 2);
        sample.put("Rabbit", 0);

        Map<String, Integer> actual = new HashMap<>();
        actual = sortMap.sortHistogramMap(sample);

        assertEquals(expected,actual);
    }

    @Test
    void sortHistogramMap_AssertNotEqualsUnSortedMap()
    {
        CreateHistogramMap sortMap = new CreateHistogramMap();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Dog", 1);
        expected.put("Fido", 2);
        expected.put("Difo", 2);


        Map<String, Integer> sample = new HashMap<>();
        sample.put("Dog", 1);
        sample.put("Fido", 2);
        sample.put("Difo", 2);

        Map<String, Integer> actual = new HashMap<>();
        actual = sortMap.sortHistogramMap(sample);

        assertNotEquals(expected,actual);
        // This test fails because it is not taking into account the sorting of the map?
        // So as long as the two maps all have the same content, they are equal?
    }
}