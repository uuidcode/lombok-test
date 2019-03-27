package com.github.uuidcode.lombok.test.delegate;

import lombok.Data;
import lombok.experimental.Accessors;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class Engine {
    private String name;
}
