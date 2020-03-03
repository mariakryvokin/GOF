package com.kryvokin.factorymethod.staticfactorymethod.publishing;

public class ConsoleWriter implements Writer {

    @Override
    public void write(byte[] context) {
        System.out.println(new String(context));
    }
}
