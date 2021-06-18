/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
    public String readFileToString()
    {
        String fileContents = "";

        try {
            File userFile = new File("src/main/java/org/example/ex46/Base/exercise46_input.txt");
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

        return fileContents;
    }
}
