/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex41.Base;

import java.io.*;

public class WriteFile
{
    public void writeStringToFile(String finalString) throws IOException {
        {
            BufferedWriter writeToFile = new BufferedWriter(new FileWriter("src/main/java/org/example/ex41/Base/" + "exercise41_output.txt", false));
            writeToFile.append("");
            writeToFile.append(finalString);
            writeToFile.close();
        }
    }
}
