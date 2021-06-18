/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex46.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringToStrArrayTest {

    @Test
    void generateStringArray_AssertTrue_ManuallyCreatedStringArrayVsFunction()
    {
        SplitStringToStrArray splitStringToArray = new SplitStringToStrArray();

        String sampleToSplit = "This is a string with only spaces ";
        String[] expected = {"This", "is", "a", "string", "with", "only", "spaces"};
        String[] actual = splitStringToArray.generateStringArray(sampleToSplit);
        assertArrayEquals(expected,actual);

    }

    @Test
    void generateStringArray_AssertTrue_ManuallyCreatedStringArrayVsFunction_LongerWithNumbers()
    {
        SplitStringToStrArray splitStringToArray = new SplitStringToStrArray();

        String sampleToSplit = "This is a string with only spaces and 3 2 1 numbers";
        String[] expected = {"This", "is", "a", "string", "with", "only", "spaces", "and", "3", "2", "1", "numbers"};
        String[] actual = splitStringToArray.generateStringArray(sampleToSplit);
        assertArrayEquals(expected,actual);

    }
}