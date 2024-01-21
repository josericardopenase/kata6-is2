import org.example.core.application.ports.IdGenerator;
import org.example.core.application.ports.TodoRespository;
import org.example.core.application.useCases.TodoCreator;
import org.example.core.application.useCases.TodoFinder;
import org.example.core.domain.*;
import org.example.core.infraestructure.mock.MockIdGenerator;
import org.example.core.infraestructure.mock.MockTodoRepository;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoTests {
    private final TodoRespository repository = new MockTodoRepository();
    private final IdGenerator generator = new MockIdGenerator();
    @Test
    public void todo_text_cannot_be_empty(){
        try{
           TodoText text = new TodoText("");
            Assert.fail();
        }catch (DomainException exception){
        }
    }
    @Test
    public void todo_id_cannot_be_less_than_cero(){
        try{
            Id id = new Id(-1);
            Assert.fail();
        }catch (DomainException exception){
        }
    }

    @Test
    public void check_todo_must_change_it_status_to_done() throws DomainException {
        Todo todo = new Todo(new Id(1), new TodoText("hello"), new TodoStatus(false));
        todo.check();
        assertThat(todo.getStatus()).isEqualTo(true);
    }
    @Test
    public void uncheck_todo_must_change_it_status_to_working_progress() throws DomainException {
        Todo todo = new Todo(new Id(1), new TodoText("hello"), new TodoStatus(true));
        todo.uncheck();
        assertThat(todo.getStatus()).isEqualTo(false);
    }

    @Test
    public void create_todo_must_add_todo_to_repository() throws DomainException {
        var useCase = new TodoCreator(repository, generator);
        var result = useCase.create("new todo");
        assertThat(result.isOk()).isEqualTo(true);
        assertThat(repository.findById(result.data().getId())).isNotNull();
    }

    @Test
    public void create_todo_message_must_be_equal_to_passed_message() throws DomainException {
        var useCase = new TodoCreator(repository, generator);
        var result = useCase.create("new todo");
        assertThat(result.data().getText()).isEqualTo("new todo");
    }

    @Test
    public void find_todos_must_return_all_added_todos(){
        var useCase = new TodoFinder(repository);
        var todo = useCase.find();
        assertThat(todo.data().isEmpty()).isEqualTo(false);
        assertThat(todo.data().size()).isEqualTo(2);
    }
}
