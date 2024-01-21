package org.example.core.domain;

import javax.lang.model.type.NullType;

public class Result<T, E> {
    private final T data;
    private final E error;

    public Result(T data, E error) {
        this.data = data;
        this.error = error;
    }

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

    public static <T, Error>Result<T, Error> ok(T data){
        return new Result<>(data, null);
    }
    public static <T, Error>Result<T, Error> fail(Error data){
        return new Result<>(null, data);
    }
}
