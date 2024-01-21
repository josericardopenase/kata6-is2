package org.example.core.infraestructure.mock;

import org.example.core.application.ports.IdGenerator;

public class MockIdGenerator implements IdGenerator {

    static int current = 0;
    @Override
    public int generate() {
        current++;
        System.out.println(current);
        return current;
    }
}
