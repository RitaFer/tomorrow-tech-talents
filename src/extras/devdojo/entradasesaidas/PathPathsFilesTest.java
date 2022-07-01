package extras.devdojo.entradasesaidas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathPathsFilesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Pasta");
        if(Files.notExists(path)){
            Path pathDirectory = Files.createDirectory(path);
        }
        Path directories = Paths.get("pasta/subpasta/subpasta");
        Path pathDirectories = Files.createDirectories(directories);
        Path filePath = Paths.get(pathDirectories.toString()+"FilePathTest.txt");
        if(Files.notExists(filePath)){
            Path createFile = Files.createFile(filePath);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "FilePathTest2.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
