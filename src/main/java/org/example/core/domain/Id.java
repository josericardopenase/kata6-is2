package org.example.core.domain;

public class Id {
    private final int id;

    public int getId() {
        return id;
    }

    public Id(int id) throws DomainException{
        this.id = id;
    }
}
