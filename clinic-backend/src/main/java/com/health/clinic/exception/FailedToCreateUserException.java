package com.health.clinic.exception;

public class FailedToCreateUserException extends Throwable {
    @Override
    public String getMessage() {
        return "Failed to create user";
    }
}
