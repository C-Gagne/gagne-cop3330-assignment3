/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex46.Base;

public class ReplaceCertainChars
{
    public String replaceToSpaces(String fileString)
    {
        String replacedFileString = "";

        replacedFileString = fileString.replaceAll("\n", " ");
        replacedFileString = replacedFileString.replaceAll("\t", " ");
        replacedFileString = replacedFileString.replaceAll("\\.", " ");
        replacedFileString = replacedFileString.replaceAll("  ", " ");

        return replacedFileString;
    }
}
