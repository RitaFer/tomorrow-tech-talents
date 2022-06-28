package programmingtechniques.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("/^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/");
        Matcher matcher = pattern.matcher("iwjkwoods@gmail.com");
        boolean matchFound = matcher.find();
        System.out.println(matchFound? "Email Válido" : "Email Inválido.");
    }
}
