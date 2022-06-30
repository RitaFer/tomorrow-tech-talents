package extras.devdojo.entradasesaidas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File arch = new File("testFile.txt");
        try(FileWriter archWriter = new FileWriter(arch, true)){
            archWriter.write("Isso é apenas um teste !\nVai concatenar?\n");
            archWriter.write("Isso é apenas um teste para ver se vai concatenar !\n");
            archWriter.flush();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
