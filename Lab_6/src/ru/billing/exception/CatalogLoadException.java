package ru.billing.exception;

import java.io.FileNotFoundException;

public class CatalogLoadException extends Exception
{
    public CatalogLoadException(String message)
    {
        super(message);
    }
}
