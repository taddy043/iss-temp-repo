
import com.company.misha.Figure.Figure;
import com.company.Chess;

public class Game {

    public static void main(String[] args) {
        // init game
        Figure figure = null;
        Chess chess = new Chess();
        chess.startGame();
        // round 1 white
        figure = chess.pickFigure(1, 1);
        chess.makeMove(figure, 2, 2);
        chess.endTurn();
        // round 2 black
        figure = chess.pickFigure(7, 7);
        chess.makeMove(figure, 6, 6);
        chess.endTurn();
        // etc...

    }
}