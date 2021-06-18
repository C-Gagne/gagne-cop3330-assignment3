/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex45.Base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {

    @Test
    void writeSiteAndAuthorToHTMLFile_AssertTrueFileIsMade()
    {
        WriteFile createWebsiteFile = new WriteFile();
        String websiteName = "ThisIsAWebsiteName";
        String content = "Written to file";
        createWebsiteFile.writeSiteAndAuthorToHTMLFile(websiteName,content);
        File checkFileExists = new File("src/main/java/org/example/ex45/Base/Output/ThisIsAWebsiteName.txt");
        boolean exists = checkFileExists.exists();

        assertTrue(exists);
    }

    @Test
    void writeSiteAndAuthorToHTMLFile_AssertFalseFileIsNotMade()
    {
        WriteFile createWebsiteFile = new WriteFile();
        String websiteName = "ThisIsAWebsiteName";
        String content = "Written to file";
        createWebsiteFile.writeSiteAndAuthorToHTMLFile(websiteName,content);
        File checkFileExists = new File("src/main/java/org/example/ex45/Base/Output/ThisIsNOTAWebsiteName.txt");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }

    @Test
    void createFileDir_AssertTrue_OutputFolderIsCreated()
    {
        WriteFile createWebsiteFiles = new WriteFile();
        String websiteName = "ThisIsAWebsiteName";
        createWebsiteFiles.createFileDir(websiteName);
        File checkFileExists = new File("src/main/java/org/example/ex45/Base/Output/");
        boolean exists = checkFileExists.exists();

        assertTrue(exists);
    }

    @Test
    void createFileDir_AssertFalse_DifferentOutputFolderIsCreated()
    {
        WriteFile createWebsiteFiles = new WriteFile();
        String websiteName = "ThisIsAWebsiteName";
        createWebsiteFiles.createFileDir(websiteName);
        File checkFileExists = new File("src/main/java/org/example/ex45/Base/Output2/");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }
}