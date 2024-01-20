package org.example.core.infraestructure.mock;

import org.example.core.application.ports.IdGenerator;

public class MockIdGenerator implements IdGenerator {
    @Override
    public int generate() {
        return 0;
    }
}
