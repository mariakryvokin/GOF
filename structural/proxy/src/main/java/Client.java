import java.io.File;
import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        FileService fileService = new FileServiceProxy();
        System.out.println(fileService.wrightToFile(new File("C:\\TMP\\lol.txt"),"fuck"));
    }
}
