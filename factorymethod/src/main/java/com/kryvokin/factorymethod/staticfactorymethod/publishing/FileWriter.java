package com.kryvokin.factorymethod.staticfactorymethod.publishing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter implements Writer {

    private String path;

    @Override
    public  void write(byte[] context) {
        try {
            Files.write(Paths.get(path),context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
