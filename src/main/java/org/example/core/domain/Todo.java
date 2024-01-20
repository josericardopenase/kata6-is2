package org.example.core.domain;

public record Todo(
        Id id,
        TodoText text,
        TodoStatus status
) {
    public void check(){}
    public void uncheck(){}

}
