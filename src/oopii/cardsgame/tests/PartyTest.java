package oopii.cardsgame.tests;

import oopii.cardsgame.boards.PartyBoard;
import oopii.cardsgame.cards.AttackCard;

public class PartyTest {
    public static void main(String[] args) {
        PartyBoard party = new PartyBoard();

        // Teste inserir jogadores e distribuir decks.
        for (int i = 0; i < 5; i++){
            party.insertPlayer();
            party.distributeDeck();
        }
        System.out.println("-----------------------------------------");

        // Teste descartar.
        for (int i = 0; i < 9; i++) {
            party.playACard(new AttackCard(), 1);
            party.playACard(new AttackCard(), 2);
            party.playACard(new AttackCard(), 3);
            party.playACard(new AttackCard(), 4);
        }
        System.out.println("-----------------------------------------");

        // Teste Vencedor
        party.checkWinner();
        System.out.println("-----------------------------------------");
        party.players.get(0).setLifePoints(0);
        party.players.get(1).setLifePoints(0);
        party.players.get(2).setLifePoints(0);
        party.players.get(3).setLifePoints(0);
        party.checkWinner();
        System.out.println("-----------------------------------------");
        party.players.get(4).setLifePoints(0);
        party.checkWinner();
        System.out.println("-----------------------------------------");
    }
}