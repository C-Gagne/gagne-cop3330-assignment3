/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex43.Base;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public void generateWebsiteFolder(String websiteName)
    {
        File makeDir = new File("src/main/java/org/example/ex43/Base/website/"+websiteName+"/");
        makeDir.mkdirs();
    }

    public void generateHTMLFile(String websiteName, String authorName)
    {
        File indexHtmlFile = new File("src/main/java/org/example/ex43/Base/website/"+websiteName+"/"+"index.html");
        try {
            if (indexHtmlFile.createNewFile()) {
                System.out.println("File created: " + indexHtmlFile.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void generateCSSFolder(String websiteName, boolean makeCSS)
    {
        if (makeCSS = false)
        {
        }
        else
        {
            File makeDir = new File("src/main/java/org/example/ex43/Base/website/"+websiteName+"/"+"css/");
            makeDir.mkdirs();
        }
    }


    public void generateJSFolder(String websiteName, boolean makeJS)
    {
        if (makeJS = false)
        {
            return;
        }
        else
        {
            File makeDir = new File("src/main/java/org/example/ex43/Base/website/"+websiteName+"/"+"js/");
            makeDir.mkdirs();
        }

    }
}
