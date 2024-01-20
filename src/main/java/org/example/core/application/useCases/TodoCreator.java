package org.example.core.application.useCases;

import org.example.core.application.ports.IdGenerator;
import org.example.core.application.ports.TodoRespository;
import org.example.core.domain.DomainError;
import org.example.core.domain.Result;
import org.example.core.domain.Todo;

public class TodoCreator {
    private final TodoRespository repository;
    private final IdGenerator generator;

    public TodoCreator(TodoRespository repository, IdGenerator generator) {
        this.repository = repository;
        this.generator = generator;
    }

    public Result<Todo, DomainError> create(String text){
        return null;
    }

}
