package org.example.core.application.ports;

import org.example.core.domain.Todo;

import java.util.List;

public interface TodoRespository {
    Todo findById(int id);
    List<Todo> findAll();
    Todo save(Todo todo);
}
