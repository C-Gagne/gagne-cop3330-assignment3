/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex45.Base;

public class App
{
    // First we have to read the file "exercise45_input.txt" to a string
        // Then we have to replace the word "utilize" with the word "use"
            // Then we have to take the user input to get the output file name
                // We can create our Output file dir.
                // Then we write out replaced string to the specified file.

    public static void main(String[] args)
    {
        ReplaceWords replaceUtilize = new ReplaceWords();
        ReadFile getFileContent = new ReadFile();
        UserInput getOutputFileName = new UserInput();
        WriteFile writeOutputToFile = new WriteFile();

        String fileString = getFileContent.readFileToString();
        String replacedFileString = replaceUtilize.replaceUtilizeWithUse(fileString);

        System.out.println("what is the name of the file you want to output?");
        String outputFileName = getOutputFileName.getUserString();

        writeOutputToFile.createFileDir(outputFileName);
        writeOutputToFile.writeSiteAndAuthorToHTMLFile(outputFileName, replacedFileString);

    }
}
