package org.example.core.domain;

public class Id {
    private final int id;

    public int getId() {
        return id;
    }

    public Id(int id) throws DomainException{
        if(id < 0) throw new DomainException("id cannot be less than 0");
        this.id = id;
    }
}
