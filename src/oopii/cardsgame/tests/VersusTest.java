package oopii.cardsgame.tests;

import oopii.cardsgame.boards.VersusBoard;
import oopii.cardsgame.cards.AttackCard;
import oopii.cardsgame.cards.SpecialAttackCard;

public class VersusTest {
    public static void main(String[] args) {
        VersusBoard versusBoard = new VersusBoard();

        // Teste inserir jogadores e distribuir decks.
        for (int i = 0; i < 2; i++){
            versusBoard.insertPlayer();
            versusBoard.distributeDeck();
        }
        System.out.println("-----------------------------------------");

        // Teste descartar.
        for (int i = 0; i < 6; i++) {
            versusBoard.playACard(new AttackCard(), 1);
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 3; i++) {
            versusBoard.playACard(new SpecialAttackCard(), 1);
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 6; i++) {
            versusBoard.playACard(new AttackCard(), 2);
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 3; i++) {
            versusBoard.playACard(new SpecialAttackCard(), 2);
        }

        // Teste Vencedor
        System.out.println("-----------------------------------------");
        versusBoard.checkWinner();
        System.out.println("-----------------------------------------");
        versusBoard.players.get(0).setLifePoints(0);
        versusBoard.checkWinner();
        System.out.println("-----------------------------------------");
        versusBoard.players.get(1).setLifePoints(0);
        versusBoard.checkWinner();
        System.out.println("-----------------------------------------");
    }
}
