import java.io.File;
import java.io.IOException;

public class FileServiceProxy implements FileService {

    private FileServiceImpl fileService;

    public FileServiceProxy(FileServiceImpl fileService) {
        this.fileService = fileService;
    }

    @Override
    public String wrightToFile(File file, String text) throws IOException {
        if(haveForbidenWords(text)){
            return "text is forbidden";
        }
        return fileService.wrightToFile(file, text);
    }

    private boolean haveForbidenWords(String text) {
        return text.toLowerCase().contains("fuck");
    }
}
