package org.example.shop.exception;

public class QuantityIsNegativeException extends Exception{
    public QuantityIsNegativeException(String message) {
        super(message);
    }
}
