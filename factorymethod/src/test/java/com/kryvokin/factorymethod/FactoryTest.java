package com.kryvokin.factorymethod;

import com.kryvokin.factorymethod.staticfactorymethod.publishing.Factory;
import com.kryvokin.factorymethod.staticfactorymethod.publishing.WriteDestination;
import com.kryvokin.factorymethod.staticfactorymethod.publishing.Writer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryTest {

    @Test
    void getWriter() {
        Writer writer = Factory.getWriter(WriteDestination.console);
        writer.write("Hello World".getBytes());
    }
}