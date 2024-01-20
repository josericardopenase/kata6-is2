package org.example.core.domain;

public record Todo(
        Id id,
        TodoText text,
        TodoStatus status
) {

}
