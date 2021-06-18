/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex45.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceWordsTest {

    @Test
    void replaceUtilizeWithUse_AssertEquals_ManualVsAutomaticString()
    {
        ReplaceWords replaceUtilize = new ReplaceWords();
        String unreplaced = "This program utilized a lot of memory.";
        String expected = "This program used a lot of memory.";
        String actual = replaceUtilize.replaceUtilizeWithUse(unreplaced);

        assertEquals(expected, actual);
    }

    @Test
    void replaceUtilizeWithUse_AssertNotEquals_UnmodifiedVsAutoModified()
    {
        ReplaceWords replaceUtilize = new ReplaceWords();
        String unreplaced = "This program utilized a lot of memory.";
        String expected = "This program utilized a lot of memory.";
        String actual = replaceUtilize.replaceUtilizeWithUse(unreplaced);

        assertNotEquals(expected, actual);
    }
}