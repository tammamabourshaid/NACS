package myTest.TruthOrDare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TruthOrDareGame {
    private List<String> players;

    public TruthOrDareGame(List<String> players) {
        this.players  = players;
    }

    public void start() {
        List<Card>cards= getCardsShuffled();
        for (Card card : cards) {
            play(card);
            prepareNextPlayer();
        }

    }

    private List<Card> getCardsShuffled() {
       List<Card>cards= new ArrayList<>();
        for (int times = 0; times < 20; times++) {
            cards.add(new Card("red"));
            cards.add(new Card("black"));
        }
        Collections.shuffle(cards);
        return cards;
    }

    private void play(Card card) {
        String player = players.get(0);
        if (card.getColor().equals("red")){
            System.out.println(player+" has to say a truth");
        }else{
            System.out.println(player+" has to perform a dare");
        }

    }

    private void prepareNextPlayer() {
Collections.rotate(players,-1);
    }
}
