/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex42.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
    public String readFile()
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
        String fileContentsOutput = fileContents;
        fileContentsOutput = fileContentsOutput.replace(',', '\n');

        return fileContentsOutput;
    }
}
