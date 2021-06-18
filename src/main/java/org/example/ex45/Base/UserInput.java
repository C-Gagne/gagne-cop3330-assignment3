/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex45.Base;

import java.util.Scanner;

public class UserInput
{
    public String getUserString()
    {
        // This function just gets the user's input as a String.
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
