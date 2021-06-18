/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex45.Base;

public class ReplaceWords
{
    public String replaceUtilizeWithUse(String fileString)
    {
        String replacedFileString = "";

        replacedFileString = fileString.replaceAll("utilize", "use");
        replacedFileString = replacedFileString.replaceAll("Utilize", "Use");

        return replacedFileString;
    }
}
