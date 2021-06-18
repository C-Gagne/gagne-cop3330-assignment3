/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex46.Base;

import java.util.List;
import java.util.Map;

public class App
{
    // First we need to read the file to a string
        // Then we need to count words in the string, separated by " " and "\n" and "\t" and "\\."
            // We can convert the file string to a string array using split. (...)
            // (...) first we should replace "\n" and "\t" with " " using string.replace
                // To do this, we have to get each word
                  // Then for each word, we generate a count
                            // Convert the string array to a list (...)
                            // (...) Then convert it to a map
                                // But the map has to be sorted by value.
                            // Writing the "string" to key and count to "value"
                                 // Finally, we print out the histogram in order of highest count

    public static void main(String[] args)
    {
        ReadFile readNewFile = new ReadFile();
        ReplaceCertainChars replaceNewChars = new ReplaceCertainChars();
        SplitStringToStrArray splitStrToStrArr = new SplitStringToStrArray();
        ConvertStringArrToList createListFromArr = new ConvertStringArrToList();
        CreateHistogramMap createHistogramMap = new CreateHistogramMap();
        OutputString generateOutputHistogram = new OutputString();

        // Read file to string
        String fileContentString = readNewFile.readFileToString();
        // Then we replace commas, periods, new line characters, and extra spaces with spaces.
        String replacedFileContentStr = replaceNewChars.replaceToSpaces(fileContentString);

        // Then we split the string into an array of strings, but using spaces as separators
        String[] outputStringArr = splitStrToStrArr.generateStringArray(replacedFileContentStr);

        // Then we create a list of words.
        List<String> listOfWords = createListFromArr.fileStringList(outputStringArr);
        // Then we create the map for the histogram.
        Map<String, Integer> createdHistogramMap = createHistogramMap.generateHistogramMap(listOfWords);
        // Then we sort the histogram map by "value" (count)
        Map<String, Integer> sortedHistogramMap = createHistogramMap.sortHistogramMap(createdHistogramMap);

        //Then we generate the output...
        String finalString = generateOutputHistogram.generateOutputString(sortedHistogramMap);
        System.out.println(finalString);


    }


}
