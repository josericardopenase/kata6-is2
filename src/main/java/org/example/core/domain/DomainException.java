package org.example.core.domain;

public class DomainException extends Exception {
    private final String errorMessage;

    public DomainException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
