package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TcTacToeTest {
    @Test
    public void test_that1CanCangeToXOnTheBoard(){
        TcTacToe tcTacToe = new TcTacToe();
        String inputConcerter = tcTacToe.converter(1);
        assertEquals("X", inputConcerter);
    }
    @Test
    public void test_that_0_CanCangeTo_O_OnTheBoard(){
        TcTacToe tcTacToe = new TcTacToe();
        String inputConcerter = tcTacToe.converter(0);
        assertEquals("O", inputConcerter);
    }
    @Test
    public void test_that_functionCanThrowException(){
        TcTacToe tcTacToe = new TcTacToe();
        String inputConcerter = tcTacToe.converter(2);
        assertEquals("invalid input", inputConcerter);
    }
    @Test
    public void test_thatPlayBoarCanTakeInInput1AndConvertsItToValuesOnThePlayBoard(){
        TcTacToe tcTacToe = new TcTacToe();
        char[] game = tcTacToe.playBoard(1,3);
        char [] expected = {0,0,'X',0,0,0,0,0,0};
        assertArrayEquals(game,expected);

    }
    @Test
    public void test_thatPlayBoardCannotTakeInvalidInput(){
        TcTacToe tcTacToe = new TcTacToe();
        char[] game = tcTacToe.playBoard(3,3);
        char [] expected = {0,0,0,0,0,0,0,0,0};
        assertArrayEquals(game,expected);
    }
    @Test
    public void test_thatPlayBoarCanTakeInInput0AndConvertsItToValuesOnThePlayBoard(){
        TcTacToe tcTacToe = new TcTacToe();
        char[] game = tcTacToe.playBoard(0,3);
        char [] expected = {0,0,'O',0,0,0,0,0,0};
        assertArrayEquals(game,expected);

    }
}
