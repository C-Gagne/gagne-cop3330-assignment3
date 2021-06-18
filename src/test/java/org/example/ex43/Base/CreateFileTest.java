/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex43.Base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CreateFileTest {

    @Test
    void generateWebsiteFolder_AssertTrue()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        createWebsiteFiles.generateWebsiteFolder(websiteName);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsAWebsiteName/");
        boolean exists = checkFileExists.exists();

        assertTrue(exists);
    }

    @Test
    void generateHTMLFile_AssertTrue()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        String authorName = "ThisIsAnAuthorName";
        createWebsiteFiles.generateHTMLFile(websiteName,authorName);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsAWebsiteName/index.html");
        boolean exists = checkFileExists.exists();

        assertTrue(exists);
    }

    @Test
    void generateCSSFolder_AssertTrue()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        boolean makeCSS = true;
        createWebsiteFiles.generateCSSFolder(websiteName, makeCSS);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsAWebsiteName/css/");
        boolean exists = checkFileExists.exists();

        assertTrue(exists);
    }

    @Test
    void generateJSFolder_AssertTrue()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        boolean makeJS = true;
        createWebsiteFiles.generateJSFolder(websiteName, makeJS);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsAWebsiteName/js/");
        boolean exists = checkFileExists.exists();

        assertTrue(exists);
    }

    @Test
    void generateWebsiteFolder_AssertFalse()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        createWebsiteFiles.generateWebsiteFolder(websiteName);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsNotAWebsiteName/");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }

    @Test
    void generateHTMLFile_AssertFalse()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        String authorName = "ThisIsAnAuthorName";
        createWebsiteFiles.generateHTMLFile(websiteName,authorName);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsNotAWebsiteName/index.html");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }

    @Test
    void generateCSSFolder_AssertFalse()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        boolean makeCSS = true;
        createWebsiteFiles.generateCSSFolder(websiteName, makeCSS);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsNotAWebsiteName/css/");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }

    @Test
    void generateJSFolder_AssertFalse()
    {
        CreateFile createWebsiteFiles = new CreateFile();
        String websiteName = "ThisIsAWebsiteName";
        boolean makeJS = true;
        createWebsiteFiles.generateJSFolder(websiteName, makeJS);
        File checkFileExists = new File("src/main/java/org/example/ex43/Base/website/ThisIsNotAWebsiteName/js/");
        boolean exists = checkFileExists.exists();

        assertFalse(exists);
    }

}