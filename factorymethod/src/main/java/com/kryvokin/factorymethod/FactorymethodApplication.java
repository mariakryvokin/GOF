package com.kryvokin.factorymethod;

import com.kryvokin.factorymethod.furniture.Demo;
import com.kryvokin.factorymethod.furniture.FurnitureFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class FactorymethodApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(FactorymethodApplication.class, args);
    }

}

