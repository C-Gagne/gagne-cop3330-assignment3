/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readFileToString_AssertTrue_FileShouldExist()
    {
            ReadFile readFile = new ReadFile();

            String fileContent = readFile.readFileToString();
            File checkFileExists = new File("src/main/java/org/example/ex46/Base/exercise46_input.txt");
            boolean exists = checkFileExists.exists();

            assertTrue(exists);
    }

    @Test
    void readFileToString_AssertNOTTrue_FileShouldNOTExist()
    {
        ReadFile readFile = new ReadFile();

        String fileContent = readFile.readFileToString();
        File checkFileExists = new File("src/main/java/org/example/ex46/Base/exercise46_input_NOT.txt");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }
}