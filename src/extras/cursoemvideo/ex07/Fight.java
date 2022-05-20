package extras.cursoemvideo.ex07;

import java.util.Objects;
import java.util.Random;

public class Fight {
    private Fighter player1;
    private Fighter player2;
    private int rounds;
    private boolean isAproved;

    public Fighter getPlayer1() {
        return player1;
    }

    public void setPlayer1(Fighter player1) {
        this.player1 = player1;
    }

    public Fighter getPlayer2() {
        return player2;
    }

    public void setPlayer2(Fighter player2) {
        this.player2 = player2;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAproved() {
        return isAproved;
    }

    public void setAproved(boolean aproved) {
        isAproved = aproved;
    }

    public void scheduleFight(Fighter p1, Fighter p2){
        if(Objects.equals(p1.getCategory(), p2.getCategory()) && p1 != p2){
            this.setAproved(true);
            this.setPlayer1(p1);
            this.setPlayer2(p2);
        } else {
            this.setAproved(false);
            this.setPlayer1(null);
            this.setPlayer2(null);
        }
    }

    public void fight(){
        if(isAproved){
            player1.toPresent();
            player2.toPresent();
            Random random = new Random();
            int option = random.nextInt(3);
            switch (option) {
                case 0 -> {
                    System.out.println("EMPATE !!!");
                    player1.drawFight();
                    player2.drawFight();
                }
                case 1 -> {
                    System.out.println("VITÓRIA !!! " + player1.getName());
                    player1.winFight();
                    player2.loseFight();
                }
                case 2 -> {
                    System.out.println("VITÓRIA !!! " + player2.getName());
                    player1.loseFight();
                    player2.winFight();
                }
                default -> System.out.println("Luta inválida, executar novamente.");
            }
        } else {
            System.out.println("Essa luta não pode acontecer.");
        }
    }
}