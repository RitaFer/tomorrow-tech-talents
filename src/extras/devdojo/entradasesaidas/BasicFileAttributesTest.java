package extras.devdojo.entradasesaidas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest {
    public static void main(String[] args) throws IOException {
        LocalDateTime timenow = LocalDateTime.now().minusDays(10);
        File file = new File("FilePathTest3.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(timenow.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("FilePathTest3Novo.txt");
        //Files.createFile(path);
        FileTime fileTime = FileTime.from(timenow.toInstant(ZoneOffset.UTC));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creation = basicFileAttributes.creationTime();
        FileTime modification = basicFileAttributes.lastModifiedTime();
        FileTime acess = basicFileAttributes.lastAccessTime();
        System.out.println("Criação: "+creation);
        System.out.println("Última Modificação: "+modification);
        System.out.println("Último Acesso: "+acess);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(creation, modification, acess);
        creation = fileAttributeView.readAttributes().creationTime();
        modification = fileAttributeView.readAttributes().lastModifiedTime();
        acess = fileAttributeView.readAttributes().lastAccessTime();
        System.out.println("Criação: "+creation);
        System.out.println("Última Modificação: "+modification);
        System.out.println("Último Acesso: "+acess);
    }
}
