import org.example.core.domain.DomainError;
import org.example.core.domain.DomainException;
import org.example.core.domain.Id;
import org.example.core.domain.TodoText;
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

}
