/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex42.Base;

public class OutputString
{
    public String[] createStringArray(String fileContent)
    {
        String[] fileContentStringArr = fileContent.split("\n");
        return fileContentStringArr;
    }

    public String generateOutputString(String[] fileContentStringArr)
    {
        StringBuilder outputString = new StringBuilder();

        outputString.append(String.format("%15s %15s %9s\n", "Last", "First", "Salary"));
        outputString.append("----------------------------------------------------\n");


        for(int i=0; i<(outputString.length()) && (-2>(i-fileContentStringArr.length));)
        {
            outputString.append(String.format("%15s %15s     %8s \n", fileContentStringArr[i], fileContentStringArr[i+1], fileContentStringArr[i+2]));
            i+=3;
        }
        return String.valueOf(outputString);
    }
}
