package org.esercizio.exception;

public class NullDrinkException extends Exception{
    public NullDrinkException() {
    }

    public NullDrinkException(String message) {
        super(message);
    }

    public NullDrinkException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullDrinkException(Throwable cause) {
        super(cause);
    }

    public NullDrinkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
