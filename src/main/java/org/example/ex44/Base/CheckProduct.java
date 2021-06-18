/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex44.Base;

// We need to verify that the user entered string is a product.

public class CheckProduct
{
    boolean checkForProduct(ProductWrapper fileContent, String productName)
    {
        for (int i=0; i<fileContent.getProducts().size(); i++)
        {
            String getProductName = fileContent.getProducts().get(i).name;

            if (getProductName.equalsIgnoreCase(productName))
            {
                return true;
            }
        }
        return false;
    }
}
