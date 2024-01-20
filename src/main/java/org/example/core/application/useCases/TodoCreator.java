package org.example.core.application.useCases;

import org.example.core.application.ports.IdGenerator;
import org.example.core.application.ports.TodoRespository;

public class TodoCreator {
    private final TodoRespository repository;
    private final IdGenerator generator;

    public TodoCreator(TodoRespository repository, IdGenerator generator) {
        this.repository = repository;
        this.generator = generator;
    }



}
