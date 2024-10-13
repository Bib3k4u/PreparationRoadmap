package TicTacToeRevision;

import java.util.Deque;
import java.util.LinkedList;

public class TurnManager {
    private Deque<Player> players;

    public TurnManager(Deque<Player> players) {
        this.players = new LinkedList<>(players);
    }

    public Player getNextPlayer() {
        Player currentPlayer = players.poll(); // Get the first player.
        players.offer(currentPlayer); // Add the player back to the end.
        return currentPlayer;
    }
}
