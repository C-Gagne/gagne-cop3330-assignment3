/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex41.Base;

import java.util.List;

public class OutputString
{
    // This is similar to ex39, we need to convert the list to a string and return it.
    // StringBuilder is a bit more versatile than a String, so we will use that.
        // We need to use String.format to get the spacing correct.
            // For each entry in sorted list, we have to print it and append a new line.
        // We then return the string version of the string builder.

    public String generateOutputString(List sortedFileList)
    {
        StringBuilder generatedOutputStr = new StringBuilder();

        generatedOutputStr.append(String.format("Total of %d names. \n", sortedFileList.size()));
        generatedOutputStr.append(String.format("-------------------------------------------------------------------\n"));

        for (int i = 0; i< sortedFileList.size(); i++)
        {
            generatedOutputStr.append(sortedFileList.get(i));
            generatedOutputStr.append("\n");
        }


        return String.valueOf(generatedOutputStr);
    }
}
