/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex43.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void validateYesOrNo_ValidY_AssertTrue()
    {
        InputValidator validYesNo = new InputValidator();
        String input = "y";

        boolean isValid = validYesNo.validateYesOrNo(input);
        assertTrue(isValid);
    }

    @Test
    void validateYesOrNo_InvalidYes_AssertFalse()
    {
        InputValidator validYesNo = new InputValidator();
        String input = "yes";

        boolean isValid = validYesNo.validateYesOrNo(input);
        assertFalse(isValid);
    }

    @Test
    void validateYesOrNo_ValidN_AssertTrue()
    {
        InputValidator validYesNo = new InputValidator();
        String input = "n";

        boolean isValid = validYesNo.validateYesOrNo(input);
        assertTrue(isValid);
    }

    @Test
    void validateYesOrNo_InvalidNo_AssertFalse()
    {
        InputValidator validYesNo = new InputValidator();
        String input = "no";

        boolean isValid = validYesNo.validateYesOrNo(input);
        assertFalse(isValid);
    }
}