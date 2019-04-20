import com.infopulse.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Field field = new Field();
        Player player1 = new Human(field, 'X');
        Player player2 = new Computer(field, 'O');
        Game game = new Game(player1, player2);
        game.start();
    }
}
