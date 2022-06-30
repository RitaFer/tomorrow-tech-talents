package extras.devdojo.entradasesaidas;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest {
    public static void main(String[] args) {
        File arquivo = new File("testFile.txt");
        try{
            boolean isCreated = arquivo.createNewFile();
            System.out.println("O arquivo foi criado? "+isCreated);
            System.out.println("\nO arquivo é um diretório? "+arquivo.isDirectory());
            System.out.println("\nO arquivo é oculto? "+arquivo.isHidden());
            System.out.println("\nQual o caminho do arquivo? "+arquivo.getPath());
            System.out.println("\nQual o caminho completo do arquivo? "+arquivo.getAbsolutePath());
            System.out.println("\nQuando ele foi modificado? "+ Instant.ofEpochMilli(arquivo.lastModified()).atZone(ZoneId.systemDefault()));

            if(arquivo.exists()){
                System.out.println("\nVou deletar isso aqui !");
                boolean isDeleted = arquivo.delete();
                System.out.println("\nO arquivo foi deletado? "+isDeleted);
            } else {
                System.out.println("\nTem mais nada aqui não.");
            }
        } catch (IOException e) {
            System.out.println("O arquivo não foi criado: "+e);
            e.printStackTrace();
        }
    }
}
