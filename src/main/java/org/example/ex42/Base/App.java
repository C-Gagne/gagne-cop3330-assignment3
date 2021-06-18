/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex42.Base;

public class App {
    public static void main(String[] args)
    {
        // All we need to do is read a file (exercise42_input) to a string
          // Assume input is "LastName,FirstName,Salary\n"
                // Take String and put it into a string array by separating out the "," <-- This doesn't work
                // To actually get a working output, the string "," have to be replaced by "\n" (...)
                    // (...) The string reader also ignores "\n", so they have to be added after each new line.
                        // (...) From there the string is split into an array using the "\n"
                            // Print string array as a table by printing string[i] string[i++] string[i++]

        ReadFile getFileContent = new ReadFile();
        OutputString genOutputString = new OutputString();

        String fileContent = getFileContent.readFile();
        String[] fileContentStringArr = genOutputString.createStringArray(fileContent);
        String finalString = genOutputString.generateOutputString(fileContentStringArr);
        System.out.println(finalString);
    }
}
