/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex45.Base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readFileToString_AssertFileDoesExist()
    {
        ReadFile readFile = new ReadFile();

        String fileContent = readFile.readFileToString();
        File checkFileExists = new File("src/main/java/org/example/ex45/Base/exercise45_input.txt");
        boolean exists = checkFileExists.exists();

        assertTrue(exists);
    }

    @Test
    void readFileToString_AssertFileDoesNOTExist()
    {
        ReadFile readFile = new ReadFile();

        String fileContent = readFile.readFileToString();
        File checkFileExists = new File("src/main/java/org/example/ex45/Base/exercise45_input_NotAfile.txt");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }
}