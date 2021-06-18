/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex41.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readFile_ReturnsTrue_ActualFile()
    {
        ReadFile readNewFile = new ReadFile();

        String result = readNewFile.readFile("exercise41_input.txt");
        boolean expected = true;
        boolean actual = !(result.isEmpty());

        assertEquals(expected,actual);

    }

    @Test
    void readFile_ReturnsFalse_NoFile()
    {
        ReadFile readNewFile = new ReadFile();

        String result = readNewFile.readFile("ex");
        boolean expected = false;
        boolean actual = !(result.isEmpty());

        assertEquals(expected,actual);

    }
}