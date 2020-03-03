package com.kryvokin.factorymethod;

import com.kryvokin.factorymethod.staticfactorymethod.publishing.FileWriter;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileWriterTest {

    private FileWriter fileWriter = new FileWriter();
    private String content = "wright to file";
    private String path = "C:\\TMP";
    private Path filePath = Paths.get(path,"testFile.txt");

    @BeforeEach
    public void setUp() throws IOException {
        fileWriter.setPath(filePath.toString());
        Files.createFile(filePath);
        fileWriter.write(content.getBytes());
    }

    @Test
    void writeFileHasContent() throws IOException {
        Assertions.assertTrue(Files.lines(filePath).allMatch(l -> l.equals(content)));
        Files.deleteIfExists(filePath);
    }
}