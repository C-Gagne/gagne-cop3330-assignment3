/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex44.Base;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJSON
{
    public ProductWrapper readJSONToProductWrapper(String jsonString)
    {
        Gson gson = new Gson();
        ProductWrapper jsonProductWrapper = gson.fromJson(jsonString, ProductWrapper.class);
        return jsonProductWrapper;
    }


    public String readJSONtoString()
        {
            String jsonString = "";

            try {
                jsonString = new String(Files.readAllBytes(Paths.get("src/main/java/org/example/ex44/Base/exercise44_input.json")));
            } catch (IOException e) {
                e.printStackTrace();
            }


            return jsonString;
        }
}
