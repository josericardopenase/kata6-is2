package org.example.core.application.useCases;

import org.example.core.application.ports.TodoRespository;
import org.example.core.domain.DomainError;
import org.example.core.domain.Result;
import org.example.core.domain.Todo;

import java.util.List;

public class TodoFinder {
    private final TodoRespository respository;

    public TodoFinder(TodoRespository respository) {
        this.respository = respository;
    }

    public Result<List<Todo>, DomainError> find(){
        return null
    }
}
