package org.example;

public class Service {
    public Service(Transaction transaction) {
        int buyerId = transaction.getProduct().getId();
    }
}
