package com.kryvokin.factorymethod.furniture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoTest {

    @Autowired
    private Demo demo;

    @Test
    void getFactory() {
        Assertions.assertNotNull(demo.getFactory("SofaCreator"));
    }
}