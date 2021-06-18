/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex41.Base;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {

    @Test
    void writeStringToFile_AssertEquals_WriteToAFile_ReadFile() throws IOException {
        String testString = "This is the string that will be written.";


        BufferedWriter fileWriter = new BufferedWriter(new FileWriter("src/main/java/org/example/ex41/Base/exercise41_output_test.txt", false));
        String expected = testString;
        fileWriter.append(testString);
        fileWriter.close();


        String actual = new String();

        try {
            File testFile = new File("src/main/java/org/example/ex41/Base/exercise41_output_test.txt");
            Scanner readFileContents = new Scanner(testFile);
            while (readFileContents.hasNextLine())
            {
                actual += (readFileContents.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        assertEquals(expected,actual);

    }
}