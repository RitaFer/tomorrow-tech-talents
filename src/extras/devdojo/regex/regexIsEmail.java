package extras.devdojo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexIsEmail {
    public static void main(String[] args) {
        String test = "iwjk@gmail.com, teste@outlook.com, Socorro_teste@gmail.com.br, 788523#@gmail.com";
        String regex = "([0-9a-zA-Z\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        System.out.println("Posições Encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
