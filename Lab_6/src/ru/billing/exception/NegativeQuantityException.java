package ru.billing.exception;

public class NegativeQuantityException extends Exception {
    public NegativeQuantityException(String message)
    {
        super(message);
    }
}
