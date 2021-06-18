/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex41.Base;

import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        // First we have to get the File's Name from the user
            // We the must pass the File Name to a function that reads the file                                     <--* test (x)
                // Then we have to pass the contents of the file into a function that sorts the file by last name   <--* test (x)
                        // To sort, we would ideally use a list.                                                    <--* test (x)
                        // We are assuming the content of the file is lastname, firstname \n
                    // From there, we have to pass the sorted file contents and create the output
                        // Print the output (Optional?)
                       // Take output and write to a file.                                                          <--* test that file is generated ()

        UserInput getInput = new UserInput();
        ReadFile readNewFile = new ReadFile();
        StringToList convertString = new StringToList();
        SortList sortNewList = new SortList();
        OutputString genOutputStr = new OutputString();
        WriteFile writeToNewFile = new WriteFile();

        // Ask for and get user input...
            // File we are testing is exercise41_input.txt
        System.out.println("What is the file name?");
        String fileName = getInput.getUserString();


        // Pass file name to class function that reads file and write it to a string.
        String fileContents = readNewFile.readFile(fileName);

        // Pass the fileContent String to be converted into a List
        List<String> fileContentList;
        fileContentList = convertString.convertStringToList(fileContents);

        // Pass the List to sortFile Function
        List<String> sortedFileList;
        sortedFileList = sortNewList.sortList(fileContentList);

        // Now that the List is sorted, we need to generate the final string.
        String finalString = genOutputStr.generateOutputString(sortedFileList);

        // Now we write the finalString to a File
        writeToNewFile.writeStringToFile(finalString);



    }
}