/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceCertainCharsTest {

    @Test
    void replaceToSpaces_ManuallyReplacedString_ComToFunction_AssertTrue()
    {
        ReplaceCertainChars replaceChars = new ReplaceCertainChars();
        String sampleString = "This should\nnot have a new line\n";
        String expected = "This should not have a new line ";
        String actual = replaceChars.replaceToSpaces(sampleString);

        assertEquals(expected,actual);
    }


    @Test
    void replaceToSpaces_UnreplacedStringCompToFunction_AssertFalse()
    {
        ReplaceCertainChars replaceChars = new ReplaceCertainChars();
        String sampleString = "This should\nnot have a new line\n";
        String expected = "This should\nnot have a new line\n";
        String actual = replaceChars.replaceToSpaces(sampleString);

        assertNotEquals(expected,actual);
    }
}