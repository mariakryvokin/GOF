package com.kryvokin.factorymethod.furniture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FurnitureFactoryTest {

    @Autowired
    private Demo demo;

    @Test
    void getNameStaticFactoryMethodApproach() {
        Optional<FurnitureFactory> sofaCreator = demo.getFactory("SofaCreator");
        if (sofaCreator.isPresent()) {
            System.out.println(sofaCreator.get().getName());
        }
    }

    @Test
    public void getName(){
        FurnitureFactory furnitureFactory = new ChairCreator();
        System.out.println(furnitureFactory.getName());
    }
}