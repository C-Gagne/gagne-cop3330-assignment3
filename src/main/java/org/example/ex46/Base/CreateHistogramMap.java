/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex46.Base;

import java.util.*;

public class CreateHistogramMap
{
    public Map generateHistogramMap(List listOfWords)
    {
        Map<String, Integer> createdHistogramMap = new HashMap<>();

        // This creates the map, and also counts repeated words.

        for (int i = 0; i < listOfWords.size(); i++) {
            if (createdHistogramMap.containsKey(listOfWords.get(i))) {
                createdHistogramMap.put(String.valueOf(listOfWords.get(i)), createdHistogramMap.get(listOfWords.get(i)) + 1);
            } else
                createdHistogramMap.put(String.valueOf(listOfWords.get(i)), 1);
        }


        return createdHistogramMap;
    }

    public Map sortHistogramMap(Map outputHistogramMap)
    {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(outputHistogramMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        list.forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
        return sortedMap;
    }
}
