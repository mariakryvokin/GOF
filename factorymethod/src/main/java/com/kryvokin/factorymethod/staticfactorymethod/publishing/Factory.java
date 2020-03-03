package com.kryvokin.factorymethod.staticfactorymethod.publishing;

import org.springframework.stereotype.Component;

@Component
public class Factory {

    public static Writer getWriter(String destination) {
        switch (destination) {
            case WriteDestination.file:
                return new FileWriter();
            default:
                return new ConsoleWriter();
        }
    }

}
