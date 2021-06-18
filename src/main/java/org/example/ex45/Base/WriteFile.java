/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex45.Base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public void writeSiteAndAuthorToHTMLFile(String outputFileName, String replacedFileContent)
    {
        try {
            FileWriter writeToFile = new FileWriter("src/main/java/org/example/ex45/Base/Output/"+outputFileName+".txt");
            writeToFile.write(replacedFileContent);
            writeToFile.close();

        } catch ( IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public void createFileDir(String outputFileName)
    {
        File makeDir = new File("src/main/java/org/example/ex45/Base/Output/");
        makeDir.mkdirs();
    }
}
