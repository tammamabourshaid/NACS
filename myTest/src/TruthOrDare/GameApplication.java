package myTest.TruthOrDare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameApplication {
    public static void main(String[] args) {
         List<String> players = getPlayers();
        TruthOrDareGame game = new TruthOrDareGame(players);
        game.start();
    }

    private static List<String> getPlayers() {
        List<String> players = Arrays.asList("Amin", "Marj", "Erika");
        return new ArrayList<>(players);
    }
}
