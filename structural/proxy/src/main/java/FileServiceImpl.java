import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileServiceImpl implements FileService {

    @Override
    public String wrightToFile(File file, String text) throws IOException {
        Files.write(Paths.get(file.getPath()),text.getBytes());
        return "was written";
    }
}
