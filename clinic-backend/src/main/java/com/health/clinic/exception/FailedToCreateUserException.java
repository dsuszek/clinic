package com.health.clinic.exception;

public class FailedToCreateUserException extends Throwable {
    //@TODO sprawdzic, jak to dziala
    public FailedToCreateUserException(String message) {

    }

    public String getMessage(String message) {
        return message;
    }
}
