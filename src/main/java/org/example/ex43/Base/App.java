/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

// First we need to ask the user for the name of the website (and store as a string)
    // Next we need to ask for the name of the author (also stored as a string)
        // We then need to ask if they want a folder for JavaScript (...)
        // We also need to ask if they want a folder for CSS (...)
        // (...) Both of these should probably be validated inputs
            // From here we need to create the website folder
                    // We then create the CSS and JS folders inside of the website folder
                        // Only if the user said Y to those options.

          // Then we create the index.html
         // Last we need to write: "the name of the site inside the <title> tag and the author in a <meta> tag." (...)
        // (...) of the html file


package org.example.ex43.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput userString = new UserInput();
        InputValidator checkYN = new InputValidator();
        CreateFile websiteGenerator = new CreateFile();
        WriteFile genFileContent = new WriteFile();

        boolean isValidYesNo = false;
        String checkMakeCSS = "";
        String checkMakeJS = "";
        boolean makeCSS = false;
        boolean makeJS = false;

        System.out.print("Site name: ");
        String websiteName = userString.getUserString();
        System.out.print("Author: ");
        String author = userString.getUserString();
        System.out.print("Do you want a folder for JavaScript? (y/n)");
            while (!isValidYesNo)
            {
                checkMakeJS = userString.getUserString();
                isValidYesNo = checkYN.validateYesOrNo(checkMakeJS);
                if (!isValidYesNo)
                {
                    System.out.println("Sorry, that is not a valid input.\nPlease try again:");
                }
            }
            if (checkMakeJS.charAt(0) == 'y')
            { makeJS = true; }
        System.out.print("Do you want a folder for CSS? (y/n)");

            isValidYesNo = false;
        while (!isValidYesNo)
        {
            checkMakeCSS = userString.getUserString();
            isValidYesNo = checkYN.validateYesOrNo(checkMakeCSS);
            if (!isValidYesNo) {
                System.out.println("Sorry, that is not a valid input.\nPlease try again:");
            }
        }
        if (checkMakeCSS.charAt(0) == 'y')
        { makeCSS = true; }

        websiteGenerator.generateWebsiteFolder(websiteName);
        websiteGenerator.generateHTMLFile(websiteName, author);
        websiteGenerator.generateJSFolder(websiteName, makeJS);
        websiteGenerator.generateCSSFolder(websiteName, makeCSS);
        
        genFileContent.writeSiteAndAuthorToHTMLFile(websiteName,author);
    }
}
