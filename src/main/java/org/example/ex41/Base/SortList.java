/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex41.Base;

import java.util.*;

public class SortList
{
    // We need to take the file contents, and sort them.
    public List sortList(List mapOfFile)
    {
        // (TreeMap documentation) The map is sorted according to the natural ordering of its keys (...) <-- This will allow for alphabetical ordering of the new map

        List<String> sortedList = new ArrayList<>(mapOfFile);
        Collections.sort(sortedList);

        return sortedList;
    }
}
