/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex43.Base;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public void writeSiteAndAuthorToHTMLFile(String websiteName, String author)
    {
        try {
            FileWriter writeToFile = new FileWriter("src/main/java/org/example/ex43/Base/website/"+websiteName+"/"+"index.html");
            writeToFile.write("<!DOCTYPE html>\n");
            writeToFile.write("<html>\n");
            writeToFile.write("<head>\n");
            writeToFile.write("\t<title>" + websiteName + "</title>\n");
            writeToFile.write("\t<meta name=\"author\" content=\"" + author + "\">\n");
            writeToFile.write("</head>\n");
            writeToFile.write("<body>\n");
            writeToFile.write("The is where I would put the website content...\n If I had any.\n");
            writeToFile.write("</body>\n");
            writeToFile.write("</html>\n");
            writeToFile.close();
        } catch ( IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
