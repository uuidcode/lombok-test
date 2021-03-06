package com.github.uuidcode.lombok.test;

import lombok.Data;

@Data
public abstract class Parent<T> {
    private String id;

    public T setId(String id) {
        this.id = id;
        return (T) this;
    }
}
