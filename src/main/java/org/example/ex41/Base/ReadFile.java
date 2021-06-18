/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex41.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
    // This function should read a file and return its content.
    // We are assuming the content of the file is lastname, firstname \n
        // When we try to read the file, we have to make sure we are actually reading it (file not found exception).
        // We can use Try and Catch for this
            // Once we know we have successfully opened the file, we read it
                // Reading a file also requires a scanner for each line
                    // We should be able to use a string builder to append each new line to the String that will be the fileContents

    public String readFile(String fileName)
    {
        String fileContents = new String();

        try {
            File userFile = new File("src/main/java/org/example/ex41/Base/" + fileName);
            Scanner readFileContents = new Scanner(userFile);
            while (readFileContents.hasNextLine())
            {
                fileContents += (readFileContents.nextLine());
                fileContents += "\n";
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }


        return fileContents;
    }
}
