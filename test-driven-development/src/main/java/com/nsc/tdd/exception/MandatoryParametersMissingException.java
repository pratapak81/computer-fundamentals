package com.nsc.tdd.exception;

public class MandatoryParametersMissingException extends RuntimeException {

    public MandatoryParametersMissingException(String message) {
        super(message);
    }

    public MandatoryParametersMissingException(String message, Exception e) {
        super(message, e);
    }
}
