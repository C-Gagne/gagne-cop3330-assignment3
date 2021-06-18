/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CreateHistogramMap_genHistogramMap_Test {

    @Test
    void generateHistogramMap_Assert_Equals_ManuallyPopulatedList()
    {
        CreateHistogramMap genHistMap = new CreateHistogramMap();
        String[] sampleArr = {"Yes","Yes","No"};
        List<String> sampleList = new ArrayList<>();
        sampleList.add(sampleArr[0]);
        sampleList.add(sampleArr[1]);
        sampleList.add(sampleArr[2]);

        Map<String,Integer> expected = new HashMap<>();
        expected.put("Yes", 2);
        expected.put("No", 1);

        Map<String,Integer> actual = new HashMap<>();
        actual = genHistMap.generateHistogramMap(sampleList);
        assertEquals(expected,actual);
    }
    @Test
    void generateHistogramMap_Assert_False_IncorrectlyPopulatedMap_IncorrectValueOfYes()
    {
        CreateHistogramMap genHistMap = new CreateHistogramMap();
        String[] sampleArr = {"Yes","Yes","No"};
        List<String> sampleList = new ArrayList<>();
        sampleList.add(sampleArr[0]);
        sampleList.add(sampleArr[1]);
        sampleList.add(sampleArr[2]);

        Map<String,Integer> expected = new HashMap<>();
        expected.put("Yes", 1);
        expected.put("No", 1);

        Map<String,Integer> actual = new HashMap<>();
        actual = genHistMap.generateHistogramMap(sampleList);
        assertNotEquals(expected,actual);
    }
}