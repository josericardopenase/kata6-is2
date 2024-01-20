package org.example.core.domain;

public class TodoStatus {
    public boolean getStatus() {
        return status;
    }

    public TodoStatus(boolean status) {
        this.status = status;
    }

    private final boolean status;
}
