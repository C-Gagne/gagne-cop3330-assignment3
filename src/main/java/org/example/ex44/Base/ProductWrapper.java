/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex44.Base;

import java.util.List;

// We need to create a ProductWrapper, because Gson doesn't read the file correctly otherwise.

public class ProductWrapper {
    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    private List<Products> products;
}