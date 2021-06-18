/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex44.Base;

// We just need to generate the final string, which requires we find what index the product is as.

public class OutputString
{
    public String generateOutputString(ProductWrapper fileContent, String productName)
    {
        int index = 0;
        for (; index<fileContent.getProducts().size(); index++)
        {
            String getProductName = fileContent.getProducts().get(index).name;

            if (getProductName.equalsIgnoreCase(productName))
            {
                break;
            }
        }

        String selectedProductName = fileContent.getProducts().get(index).name;
        double selectedProductPrice = fileContent.getProducts().get(index).price;
        int selectedProductQuantity = fileContent.getProducts().get(index).quantity;

        return String.format("Name: %s\nPrice: %.2f\nQuantity: %d", selectedProductName,selectedProductPrice,selectedProductQuantity);
    }
}
