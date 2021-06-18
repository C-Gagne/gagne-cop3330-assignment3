/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex43.Base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileTest {

    @Test
    void writeSiteAndAuthorToHTMLFile_FileIsNOTCreated_AssertFalse()
    {
        {
            CreateFile createWebsiteFiles = new CreateFile();
            String websiteName = "ThisIsAWebsiteName";
            String authorName = "ThisIsAnAuthorName";
            createWebsiteFiles.generateHTMLFile(websiteName,authorName);
            File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsNotAWebsiteName/index.html");
            boolean exists = checkFileExists.exists();

            assertFalse(exists);
        }
    }

    @Test
    void writeSiteAndAuthorToHTMLFile_FileIsCreated_AssertTrue()
    {
        {
            CreateFile createWebsiteFiles = new CreateFile();
            String websiteName = "ThisIsAWebsiteName";
            String authorName = "ThisIsAnAuthorName";
            createWebsiteFiles.generateHTMLFile(websiteName,authorName);
            File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsAWebsiteName/index.html");
            boolean exists = checkFileExists.exists();

            assertTrue(exists);
        }
    }
}