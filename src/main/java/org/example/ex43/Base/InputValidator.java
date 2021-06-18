/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex43.Base;

public class InputValidator
{
    public boolean validateYesOrNo(String yesOrNo)
    {
        if (yesOrNo.length() != 1)
        {return false;}

        char userAns = yesOrNo.charAt(0);

        if (!Character.isLetter(userAns))
        {
            return false;
        }
        else if (Character.toLowerCase(userAns) != 'n' && Character.toLowerCase(userAns) != 'y')
        {
            return false;
        }
        else {return true;}
    }
}
