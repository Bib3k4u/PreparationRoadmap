package TicTacToeRevision;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", 'X');
        Player player2 = new Player("Bob", 'O');
        Deque<Player> players = new LinkedList<>();
        players.offer(player1);
        players.offer(player2);

        GameController game = new GameController(3, players); // 3x3 board
        game.startGame();
    }
}
