package org.example.core.infraestructure.mock;

import org.example.core.application.ports.TodoRespository;
import org.example.core.domain.Todo;

import java.util.List;

public class MockTodoRepository implements TodoRespository {
    @Override
    public Todo findById(int id) {
        return null;
    }

    @Override
    public List<Todo> findAll() {
        return null;
    }

    @Override
    public Todo save(Todo todo) {
        return null;
    }
}
