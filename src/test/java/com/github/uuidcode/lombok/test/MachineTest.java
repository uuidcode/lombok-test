package com.github.uuidcode.lombok.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {
    @Test
    public void test() {
        Machine machine = Machine.of()
            .setId("test");

        machine.setName("hello");

        System.out.println(machine);
    }
}