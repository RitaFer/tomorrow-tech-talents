package extras.devdojo.entradasesaidas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        File arch = new File("testBuffered.txt");
        FileWriter archWriter = new FileWriter(arch);
        try(BufferedWriter bf = new BufferedWriter(archWriter)){
            bf.write("Isso é apenas um teste !");
            bf.newLine();
            bf.write("Isso é apenas um teste para ver se vai concatenar !\n");
            bf.flush();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}