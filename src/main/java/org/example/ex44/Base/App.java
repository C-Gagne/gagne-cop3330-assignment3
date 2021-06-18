/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex44.Base;


public class App
{
    public static void main(String[] args)
    {
        // First we have to read the JSON file and write the fileContent into a String
            // Then we have to create a list of products from the string.
                //
            // Once we have written the fileContent to a list, we need to ask the user (...)
            // (...) for the "name" key value of the product they are looking for
                // We need to see if that value exists as a "name".
                    // If it doesn't, we need to ask again (while loop)
                    // If it does, we take that value and print out the name, price, and quantity

        ReadJSON getFileContentList = new ReadJSON();
        UserInput getUserInput = new UserInput();
        CheckProduct checkProductExists = new CheckProduct();
        OutputString generateFinalString = new OutputString();


        String fileContent = getFileContentList.readJSONtoString();
        ProductWrapper wrapperFileContent = getFileContentList.readJSONToProductWrapper(fileContent);

        String productName = "";
        boolean productExists = false;

        while (!productExists)
        {
            System.out.print("What is the name of the product? ");
            productName = getUserInput.getUserString();
            productExists = checkProductExists.checkForProduct(wrapperFileContent,productName);


            if (!productExists)
            {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }

        String finalString = generateFinalString.generateOutputString(wrapperFileContent, productName);
        System.out.println(finalString);

    }
}
