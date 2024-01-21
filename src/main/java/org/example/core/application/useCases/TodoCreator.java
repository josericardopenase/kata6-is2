package org.example.core.application.useCases;

import org.example.core.application.ports.IdGenerator;
import org.example.core.application.ports.TodoRespository;
import org.example.core.domain.*;

public class TodoCreator {
    private final TodoRespository repository;
    private final IdGenerator generator;

    public TodoCreator(TodoRespository repository, IdGenerator generator) {
        this.repository = repository;
        this.generator = generator;
    }

    public Result<Todo, DomainError> create(String text){
        try {
            var id = new Id(generator.generate());
            var todoText = new TodoText(text);
            Todo todo = new Todo(id, todoText, TodoStatus.inProgress());
            repository.save(todo);
            return Result.ok(todo);
        } catch (DomainException e) {
            return Result.fail( new DomainError(
                    "Invalid data",
                    200
            ));
        }
    }

}
