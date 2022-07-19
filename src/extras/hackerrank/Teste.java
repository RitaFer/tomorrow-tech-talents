package extras.hackerrank;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;

public class Teste {
    //Validar os dados do usuário com o banco
    //user e email

    //Gerar o Token
    static Integer getRandomToken() {
        Random ran = new Random();
        int token = ran.nextInt(9999 - 1000 + 1);
        return token;
    }

    //Gerar a hora atual
    static LocalDateTime getTimeToken() {
        ZoneId zid = ZoneId.of("America/Sao_Paulo");
        LocalDateTime lt = LocalDateTime.now(zid);
        return lt;
    }

    //Enviar e-mail

    //Validar o token

    //Validar o horário

    //Setar nova senha

    public static void main(String[] args) {
        System.out.println("Token: " + getRandomToken());
        System.out.println("Horário Atual: "+ getTimeToken());
    }
}