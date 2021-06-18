/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex46.Base;

import java.util.*;

public class OutputString
{
    public String generateOutputString(Map sortedHistogramMap)
    {


        StringBuilder finalOutputString = new StringBuilder();

        // We have to get the keys; in order.
        String[] keys = (String[]) sortedHistogramMap.keySet().toArray(new String[0]);


        for (int i = (sortedHistogramMap.size()-1); 0<=i; i--)
        {
            int wordCount = (int) sortedHistogramMap.get(keys[i]);
            String word = keys[i];

            finalOutputString.append(word +": ");
            // We have to append "*"'s equal to the word count for the key
            for (int j =0; j<wordCount; j++)
            {
                finalOutputString.append("*");
            }
            // And add a new line to it...
            finalOutputString.append("\n");
        }



        return String.valueOf(finalOutputString);
    }
}
