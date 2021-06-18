/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex41.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringToListTest {

    @Test
    void convertStringToList_FromArray_ReturnsEquals()
    {
        String testString = "Gigi, Mo\nDifo, Fido\n";
        String[] testStringArray = {"Gigi, Mo", "Difo, Fido"};

        StringToList convertString = new StringToList();

        List<String> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(testStringArray));

        List<String> actual = new ArrayList<>();
        actual = convertString.convertStringToList(testString);

        assertEquals(expected, actual);
    }
}