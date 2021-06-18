/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConvertStringArrToListTest {

    @Test
    void fileStringList_AssertTrue_ArrayToList()
    {
        ConvertStringArrToList convertArrToList = new ConvertStringArrToList();

        String[] sampleArr = {"Yes","No"};
        List<String> expected = new ArrayList<>();
        expected.add(sampleArr[0]);
        expected.add(sampleArr[1]);

        List<String> actual = new ArrayList<>();
        actual = convertArrToList.fileStringList(sampleArr);

        assertEquals(expected, actual);

    }

    @Test
    void fileStringList_AssertFalse_OnlyPartiallyManuallyCreatedList()
    {
        ConvertStringArrToList convertArrToList = new ConvertStringArrToList();

        String[] sampleArr = {"Yes","No"};
        List<String> expected = new ArrayList<>();
        expected.add(sampleArr[0]);

        List<String> actual = new ArrayList<>();
        actual = convertArrToList.fileStringList(sampleArr);

        assertNotEquals(expected, actual);

    }
}