package org.example.core.domain;

public class TodoText {
    private final String text;

    public String getText() {
        return text;
    }

    public TodoText(String text) throws DomainException {
        this.text = text;
    }
}
