package com.kryvokin.factorymethod.furniture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Demo {

    @Autowired
    public List<FurnitureFactory> furnitureFactory;

    public Optional<FurnitureFactory> getFactory(String name){
        return furnitureFactory.stream().filter(f -> f.getClass().getSimpleName().equals(name)).findFirst();
    }

}
