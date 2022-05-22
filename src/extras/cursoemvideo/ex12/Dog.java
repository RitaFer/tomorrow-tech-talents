package extras.cursoemvideo.ex12;

import java.util.Objects;

public class Dog extends Mammal{
    public void reaction(String sentence){
        if(Objects.equals(sentence, "Comida") || Objects.equals(sentence, "Oii")){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reaction(int hour, int min){
        if(hour<12){
            System.out.println("Abanar");
        }else if(hour>=18){
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reaction(boolean owner){
        if(owner){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }

    public void reaction(int age, float weight){
        if(age < 5) {
            if(weight<10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        } else{
            if(weight<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }

    @Override
    public void emitSound(){
        System.out.println("Au! Au! Au! ...");
    }
}