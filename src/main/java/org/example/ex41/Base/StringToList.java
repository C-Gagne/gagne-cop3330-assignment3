/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex41.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList
{
    public List<String> convertStringToList(String fileContents)
    {
        // First we need to create a list to hold our values
        // We also need to declare a string array, with each entry being separated by the new line in the files
        // Populate the list with the new string
        // intelliJ tells us that we can populate the list by using our String Array, so that is what we do.
            // Then return the list (to be used in SortList)

        String[] fileContentsStringArray = fileContents.split("\n");

        List<String> fileContentsList = new ArrayList<>(Arrays.asList(fileContentsStringArray));

        return fileContentsList;
    }
}
