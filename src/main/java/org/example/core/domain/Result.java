package org.example.core.domain;

public record Result<T, E>(T data, E error) {

    public boolean isOk() {
        return data != null && error == null;
    }

    public boolean isFailure() {
        return data == null && error != null;
    }

    @Override
    public T data() {
        return data;
    }

    @Override
    public E error() {
        return error;
    }

    public static <T, Error> Result<T, Error> ok(T data) {
        return new Result<>(data, null);
    }

    public static <T, Error> Result<T, Error> fail(Error data) {
        return new Result<>(null, data);
    }
}
