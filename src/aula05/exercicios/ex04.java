package aula05.exercicios;

/*
Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista estava dirigindo nela e calcule a
multa que uma pessoa vai receber, sabendo que são pagos:
	a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida (ex.: velocidade máxima: 50km/h;
	motorista a 60km/h ou a 56km/h);
	b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
	c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Qual a velocidade máxima permitida? ");
        int maximumSpeed = scanner.nextInt();
        System.out.print("Qual a velocidade que você estava dirigindo? ");
        double measuredSpeed = scanner.nextDouble();

        double exceededSpeed = measuredSpeed - maximumSpeed;

        if (exceededSpeed < 0) {
            System.out.print("Você está dentro da velocidade permitida!");
        }else if(exceededSpeed > 0 && exceededSpeed <= 10){
            System.out.print("Sua multa é no valor de R$ 50,00, por ter ultrapassado a velocidade máxima permitida em " + exceededSpeed + "km/h.");
        } else if(exceededSpeed > 10 && exceededSpeed <= 30){
            System.out.print("Sua multa é no valor de R$ 100,00, por ter ultrapassado a velocidade máxima permitida em " + exceededSpeed + "km/h.");
        } else if(exceededSpeed > 30){
            System.out.print("Sua multa é no valor de R$ 200,00, por ter ultrapassado a velocidade máxima permitida em " + exceededSpeed + "km/h.");
        }
    }
}
