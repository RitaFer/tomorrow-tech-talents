package oopii.cardsgame.boards;

import oopii.cardsgame.cards.GenericCard;

public interface IGenericBoard {
    void distributeDeck();
    void insertPlayer();
    void playACard(GenericCard card, int numberPlayer);
    void checkWinner();
}