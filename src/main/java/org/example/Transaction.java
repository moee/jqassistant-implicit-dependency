package org.example;

import org.example.domain.Product;

public class Transaction {
    private Product product;

    public Transaction(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
