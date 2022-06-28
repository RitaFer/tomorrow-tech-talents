package programmingtechniques.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phones {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\s*(\\d{2}|\\d{0})[-. ]?(\\d{5}|\\d{4})[-. ]?(\\d{4})[-. ]?\\s*$");
        Matcher matcher = pattern.matcher("11930467909");
        boolean matchFound = matcher.find();
        System.out.println(matchFound? "Telefone Válido" : "Telefone Inválido.");
    }
}