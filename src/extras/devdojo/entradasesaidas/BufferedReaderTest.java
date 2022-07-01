package extras.devdojo.entradasesaidas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        File arch = new File("testBuffered.txt");
        FileReader archReader = new FileReader(arch);
        try(BufferedReader br = new BufferedReader(archReader)){
            String line;
            while ((line=br.readLine())!=null){
                System.out.print(line);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
