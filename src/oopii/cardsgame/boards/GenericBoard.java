package oopii.cardsgame.boards;

import oopii.cardsgame.players.Player;
import oopii.cardsgame.cards.GenericCard;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericBoard implements IGenericBoard {
    protected int numberOfPlayers = 0;
    protected int numberOfDecks = 0;
    protected List<GenericCard[]> decks = new ArrayList<>();
    public List<Player> players = new ArrayList<>();

    protected boolean isThereBlankField(boolean[] fields) {
        for (boolean field : fields) {
            if (!field) {
                return true;
            }
        }
        System.out.println("Não existe espaço vazio.");
        return false;
    }

    protected int getBlankField(boolean[] fields) {
        int counter = 0;
        for (boolean field : fields) {
            if (!field) {
                System.out.print((counter + 1) + "° posição:");
                break;
            }
            counter++;
        }
        return counter;
    }
}