/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex46.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringArrToList
{
    public List fileStringList(String[] outputStringArr)
    {
        List<String> outputStringList = new ArrayList<>(Arrays.asList(outputStringArr));
        return outputStringList;
    }
}
