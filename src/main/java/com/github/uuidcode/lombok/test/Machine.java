package com.github.uuidcode.lombok.test;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.Delegate;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class Machine {
    private String id;
    @Delegate
    private Engine engine = Engine.of();
}
