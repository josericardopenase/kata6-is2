package org.example.core.domain;

public class Result<T, E> {
    public boolean isOk(){
        return false;
    }

    public boolean isFailure(){
        return false;
    }

    public T getData(){
        return null;
    }

    public E getError(){
        return null;
    }
}
