package com.github.uuidcode.lombok.test.delegate;

import org.junit.Test;

public class MachineTest {
    @Test
    public void test() {
        Machine machine = Machine.of()
            .setId("test");

        machine.setName("hello");

        System.out.println(machine);
    }
}