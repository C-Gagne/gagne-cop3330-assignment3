/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

public class SplitStringToStrArray
{
    public String[] generateStringArray(String replacedFileContentString)
    {
        String[] fileStringArr = replacedFileContentString.split(" ");

        return fileStringArr;
    }
}
