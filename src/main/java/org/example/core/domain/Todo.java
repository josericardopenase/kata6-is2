package org.example.core.domain;

public class Todo {
    public Todo(Id id, TodoText text, TodoStatus status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }

    public String getText() {
        return text.getText();
    }

    public boolean getStatus() {
        return status.getStatus();
    }

    private Id id;
    private TodoText text;
    private TodoStatus status;
    public void check(){
        this.status = TodoStatus.done();
    }
    public void uncheck(){
        this.status = TodoStatus.inProgress();
    }

    public int getId() {
        return id.getId();
    }
}
