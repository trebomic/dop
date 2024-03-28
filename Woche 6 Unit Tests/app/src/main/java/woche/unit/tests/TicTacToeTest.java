import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    private TicTacToe game;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
    }

    @Test
    void testInitialBoardIsEmpty() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(' ', game.getBoardChar(i, j), "Board should be empty at the start.");
            }
        }
    }

    @Test
    void testMakeMoveValidPosition() {
        assertTrue(game.makeMove(0, 0), "Making a move to a valid position should return true.");
        assertEquals('X', game.getBoardChar(0, 0), "The first move should place an X.");
    }

    @Test
    void testMakeMoveInvalidPosition() {
        game.makeMove(0, 0); // Zuerst ein gültiger Zug
        assertFalse(game.makeMove(0, 0), "Making a move to an occupied position should return false.");
    }

    @Test
    void testSwitchPlayerAfterMove() {
        game.makeMove(0, 0);
        game.makeMove(1, 1); // Dies sollte intern switchPlayer aufrufen
        assertEquals('O', game.getBoardChar(1, 1), "After two moves, it should be player O's turn.");
    }

    @Test
    void testWinningConditionRows() {
        game.makeMove(0, 0); // X
        game.makeMove(1, 0); // O
        game.makeMove(0, 1); // X
        game.makeMove(1, 1); // O
        game.makeMove(0, 2); // X wins
        assertTrue(game.hasWon(), "Player X should win with 3 in a row.");
    }

    @Test
    void testWinningConditionColumns() {
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // O
        game.makeMove(1, 0); // X
        game.makeMove(1, 1); // O
        game.makeMove(2, 0); // X wins
        assertTrue(game.hasWon(), "Player X should win with 3 in a column.");
    }

    @Test
    void testWinningConditionDiagonals() {
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // O
        game.makeMove(1, 1); // X
        game.makeMove(0, 2); // O
        game.makeMove(2, 2); // X wins
        assertTrue(game.hasWon(), "Player X should win with 3 in a diagonal.");
    }

    @Test
    void testNoWinningCondition() {
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // O
        game.makeMove(1, 1); // X
        assertFalse(game.hasWon(), "There should be no winner yet.");
    }

    @Test
    void testBoardFullWithoutWinner() {
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // O
        game.makeMove(0, 2); // X
        game.makeMove(1, 0); // O
        game.makeMove(1, 1); // X
        game.makeMove(1, 2); // O
        game.makeMove(2, 0); // X
        game.makeMove(2, 1); // O
        game.makeMove(2, 2); // X
        assertTrue(game.isBoardFull() && !game.hasWon(), "The board should be full with no winner.");
    }

    @Test
    void testBoardNotFull() {
        game.makeMove(0, 0); // X
        assertFalse(game.isBoardFull(), "The board should not be full after only one move.");
    }
}