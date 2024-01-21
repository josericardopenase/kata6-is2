package org.example.core.infraestructure.mock;

import org.example.core.application.ports.TodoRespository;
import org.example.core.domain.Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MockTodoRepository implements TodoRespository {
    private final List<Todo> todos = new ArrayList<>();
    @Override
    public Todo findById(int id) {
        return todos.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public List<Todo> findAll() {
        return todos
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public Todo save(Todo todo) {
        this.todos.add(todo);
        return todo;
    }
}
