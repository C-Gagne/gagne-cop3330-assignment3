/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex41.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    @Test
    void sortList_Sorted_ReturnsTrue()
    {
        SortList sortNewList = new SortList();

        List<String> testList = new ArrayList<>();

        testList.add("John");
        testList.add("Bob");


        List<String> testListSorted = new ArrayList<>();

        testListSorted.add("Bob");
        testListSorted.add("John");

        List actual = sortNewList.sortList(testList);
        List expected = testListSorted;

        assertEquals(expected, actual);

    }

    @Test
    void sortList_NotSorted_ReturnsTrue()
    {
        SortList sortNewList = new SortList();

        List<String> testList = new ArrayList<>();

        testList.add("John");
        testList.add("Bob");


        List<String> testListNotSorted = new ArrayList<>();

        testListNotSorted.add("John");
        testListNotSorted.add("Bob");


        List actual = sortNewList.sortList(testList);
        List expected = testListNotSorted;

        assertNotEquals(expected, actual);

    }
}