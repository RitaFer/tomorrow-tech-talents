package oopii.cardsgame.boards;

import oopii.cardsgame.players.Player;
import oopii.cardsgame.cards.GenericCard;
import oopii.cardsgame.cards.SpecialAttackCard;

public class PartyBoard extends GenericBoard {
    private final boolean[] fieldAttackCard = new boolean[34];

    @Override
    public void distributeDeck() {
        if (numberOfDecks < 5){
            this.decks.add(new GenericCard[80]);
            numberOfDecks ++;
            System.out.println(this.numberOfDecks +"° deck foi foi distribuido.");
        } else {
            System.out.println("Todos os decks foram distribuidos.");
        }
    }

    @Override
    public void insertPlayer() {
        if (numberOfPlayers < 5){
            this.players.add(new Player(50));
            numberOfPlayers++;
            System.out.println(this.numberOfPlayers +"° jogador foi adicionado.");
        } else {
            System.out.println("Todos os jogadores foram adicionados.");
        }
    }

    @Override
    public void playACard(GenericCard card, int numberPlayer) {
        if (isThereBlankField(this.fieldAttackCard)){
            this.fieldAttackCard[getBlankField(this.fieldAttackCard)] = true;
            System.out.println(" carta de ataque invocada, " + "pelo jogador " + numberPlayer);
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
        if (counter < 4){
            System.out.println("O jogo está em andamento.");
        } else if (counter == 4) {
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
