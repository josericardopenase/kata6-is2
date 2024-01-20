package org.example.core.domain;

public class TodoText {
    private final String text;

    public String getText() {
        return text;
    }

    public TodoText(String text) throws DomainException {
        if(text.isBlank() || text.isEmpty()) throw new DomainException("text cannot be null");
        this.text = text;
    }
}
