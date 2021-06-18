/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex42.Base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readFile_AssertEquals_ManualReadFile()
    {
        String fileContents = "";

        try {
            File userFile = new File("src/main/java/org/example/ex42/Base/exercise42_input.txt");
            Scanner readFileContents = new Scanner(userFile);
            while (readFileContents.hasNextLine())
            {
                fileContents += readFileContents.nextLine();
                fileContents += "\n";

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        String actual = fileContents;
        actual = actual.replace(',', '\n');

        String expected = "Ling\nMai\n55900\n" +
                "Johnson\nJim\n56500\n" +
                "Jones\nAaron\n46000\n" +
                "Jones\nChris\n34500\n" +
                "Swift\nGeoffrey\n14200\n" +
                "Xiong\nFong\n65000\n" +
                "Zarnecki\nSabrina\n51500\n";


        assertEquals(expected, actual);
    }

    @Test
    void readFile_AssertNOTEquals_EmptyStringComparedToFile()
    {
        String fileContents = "";

        try {
            File userFile = new File("src/main/java/org/example/ex42/Base/exercise42_input.txt");
            Scanner readFileContents = new Scanner(userFile);
            while (readFileContents.hasNextLine())
            {
                fileContents += readFileContents.nextLine();
                fileContents += "\n";

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        String actual = fileContents;
        actual = actual.replace(',', '\n');

        String expected = "";


        assertNotEquals(expected, actual);
    }
}