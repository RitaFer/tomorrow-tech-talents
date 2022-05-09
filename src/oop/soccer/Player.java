package oop.soccer;
import java.time.LocalDate;
import java.util.Random;

public class Player {
    int id;
    String name;
    String nickname;
    LocalDate birth;
    int number;
    String position;
    int quality;
    int numberYellowCards;
    int numberRedCards;
    boolean suspended;
    boolean trained;

    public Player(int id, String name, String nickname, LocalDate birth, int number, String position, int quality, int numberYellowCards, int numberRedCards, boolean suspended) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.birth = birth;
        this.number = number;
        this.position = position;
        this.quality = quality;
        this.numberYellowCards = numberYellowCards;
        this.numberRedCards = numberRedCards;
        this.suspended = suspended;
    }

    public boolean verifyGameCondition(){
        return suspended;
    }

    public void yellowCards(int quantity){
        numberYellowCards += quantity;
        if (numberYellowCards >= 3){
            suspended = true;
        }
    }

    public void redCards(){
        numberRedCards++;
        if (numberRedCards >= 1){
            suspended = true;
        }
    }

    public void cancelSuspension(){
        numberYellowCards = 0;
        numberRedCards = 0;
        suspended = false;
    }

    public void runTraining(){
        if (!trained){
            Random random = new Random();
            int addedPoints = (random.nextInt(3)+1);
            quality += addedPoints;
            trained = true;
            System.out.println("A qualidade do "+name+" subiu "+addedPoints+" e agora é: "+quality+" pontos.");
        }else{
            System.out.println(name + " já completou o treinamento para o próximo jogo.");
        }
    }

    public void getInjured(){
        Random random = new Random();
        int probability = random.nextInt(100)+1;
        if (probability <= 5){
            quality *= 0.85;
            System.out.println("A qualidade do "+name+" caiu "+(int)(quality*0.15)+" e agora é: "+quality+" pontos.");
        } else if (probability <= 15) {
            quality *= 0.9;
            System.out.println("A qualidade do "+name+" caiu "+(int)(quality*0.10)+" e agora é: "+quality+" pontos.");
        } else if (probability <= 30) {
            quality *= 0.95;
            System.out.println("A qualidade do "+name+" caiu "+(int)(quality*0.05)+" e agora é: "+quality+" pontos.");
        } else if (probability <= 60) {
            quality -= 2;
            if (quality < 0){
                quality = 0;
            }
            System.out.println("A qualidade do "+name+" caiu "+2+" e agora é: "+quality+" pontos.");
        } else {
            quality -= 1;
            if (quality < 0){
                quality = 0;
            }
            System.out.println("A qualidade do "+name+" caiu "+1+" e agora é: "+quality+" pontos.");
        }
    }

    public void isEscalated(){
        trained = false;
    }

    @Override
    public String toString() {
        return  position + ": " +
                number + " - " +
                name + " - (" +
                nickname + ") - " +
                birth + " " +
                "CONDIÇÃO: " +
                (verifyGameCondition() ? "NÃO PODE JOGAR" : "PODE JOGAR")
                ;
    }
}