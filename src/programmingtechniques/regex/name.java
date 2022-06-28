package programmingtechniques.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class name {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\"[A-zÀ-ú']{2}\\\\s[A-zÀ-ú']{2}");
        Matcher matcher = pattern.matcher("CÁSSIA");
        boolean matchFound = matcher.find();
        System.out.println(matchFound? "Nome Válido." : "Nome Inválido.");
    }
}