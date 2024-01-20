import org.example.core.domain.*;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoTests {
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
        assertThat(todo.status().getStatus()).isEqualTo(true);
    }
    @Test
    public void uncheck_todo_must_change_it_status_to_working_progress() throws DomainException {
        Todo todo = new Todo(new Id(1), new TodoText("hello"), new TodoStatus(true));
        todo.uncheck();
        assertThat(todo.status().getStatus()).isEqualTo(false);
    }

    @Test
    public void create_todo_must_add_todo_to_repository() throws DomainException {
    }
}
