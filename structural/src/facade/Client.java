package facade;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client {

    public static void main(String[] args) {
        FileConvertor  fileConvertor = new FileConvertor();
        fileConvertor.convertFile(new File("c:/temp"),".json");
    }
}
