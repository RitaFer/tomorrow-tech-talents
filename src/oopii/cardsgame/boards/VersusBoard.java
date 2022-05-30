package oopii.cardsgame.boards;

import oopii.cardsgame.players.Player;
import oopii.cardsgame.cards.AttackCard;
import oopii.cardsgame.cards.GenericCard;
import oopii.cardsgame.cards.SpecialAttackCard;
import java.util.ArrayList;
import java.util.List;

public class VersusBoard extends GenericBoard {
    private final List<boolean[]> fieldAttackCard = new ArrayList<>();
    private final List<boolean[]> fieldSpecialAttackCard = new ArrayList<>();

    public VersusBoard() {
        for (int i = 0; i < 2; i++) {
            this.fieldAttackCard.add(new boolean[5]);
            this.fieldSpecialAttackCard.add(new boolean[2]);
        }
    }

    @Override
    public void distributeDeck() {
        if (numberOfDecks < 2){
            this.decks.add(new GenericCard[50]);
            numberOfDecks ++;
            System.out.println(this.numberOfDecks +"° deck foi foi distribuido.");
        } else {
            System.out.println("Todos os decks foram distribuidos.");
        }
    }

    @Override
    public void insertPlayer() {
        if (numberOfPlayers < 2){
            this.players.add(new Player(20));
            numberOfPlayers++;
            System.out.println(this.numberOfPlayers +"° jogador foi adicionado.");
        } else {
            System.out.println("Todos os jogadores foram adicionados.");
        }
    }

    @Override
    public void playACard(GenericCard card, int numberPlayer) {
        if (card instanceof SpecialAttackCard){
            boolean[] field = this.fieldSpecialAttackCard.get(numberPlayer - 1);
            if (isThereBlankField(field)){
                field[getBlankField(field)] = true;
                System.out.println(" carta de ataque especial invocada, pelo jogador " + numberPlayer);
            }
        } else if (card instanceof AttackCard) {
            boolean[] field = this.fieldAttackCard.get(numberPlayer - 1);
            if (isThereBlankField(field)) {
                field[getBlankField(field)] = true;
                System.out.println(" carta de ataque invocada, pelo jogador " + numberPlayer);
            }
        }
    }

    @Override
    public void checkWinner() {
        int counter = 0;
        int indexWinner = 0;
        for (Player player: this.players) {
            if (player.getLifePoints() == 0){
                counter++;
            }
        }
        if (counter < 1){
            System.out.println("O jogo está em andamento.");
        } else if (counter == 1) {
            counter = 0;
            for (Player player: this.players) {
                if (player.getLifePoints() != 0){
                    break;
                }
                counter++;
                indexWinner = counter;
            }
            System.out.println("Vencedor é o jogador: " + (indexWinner+1));
        } else {
            System.out.println("Não teve ganhadores !!");
        }
    }
}