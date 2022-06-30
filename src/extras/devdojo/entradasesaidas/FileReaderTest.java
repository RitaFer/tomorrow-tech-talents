package extras.devdojo.entradasesaidas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File arch = new File("testFile.txt");
        try(FileReader archReader = new FileReader(arch)){
            //retorna apenas a primeira letra em ASCII
            System.out.println(archReader.read());

            //retorna o número total de caracteres do arquivo
            char[] total = new char[1000];
            int size = archReader.read(total);
            System.out.println(size);

            //retorna o conteúdo total do arquivo
            int i;
            while ((i=archReader.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
