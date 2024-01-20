package org.example.core.domain;

public record DomainError(
        String message,
        int code
) {
}
