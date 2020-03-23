package com.nsc.tdd.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Exception e) {
        super(message, e);
    }
}
