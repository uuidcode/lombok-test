package com.github.uuidcode.lombok.test;

import org.junit.Test;

public class ChildTest {
    @Test
    public void test() {
        Child child = Child.of().setId("1").setName("Hello");
        System.out.println(child);
    }
}