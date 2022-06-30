package extras.devdojo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexIsHexadecimal {
    public static void main(String[] args) {
        String test = "0x1f 0X2GB 0x 0xDFC562 0xf 0xG";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        System.out.println("Posições Encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
