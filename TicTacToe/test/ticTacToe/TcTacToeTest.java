package ticTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TcTacToeTest {
    @Test
    public void test_thatWeHaveAPlayingBoard(){
        int [] board = TcTacToe.playingBoard();
        int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(board,expected);
    }
    @Test
    public void test_that_Userinput_Has_To_be_Only_X_And_O(){

    }


}
