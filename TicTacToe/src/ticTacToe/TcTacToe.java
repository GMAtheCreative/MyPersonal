package ticTacToe;

public class TcTacToe {

    public String converter(int input) {
        return input == 1 ? "X" : input == 0 ? "O" : "invalid input";
    }

    public char [] playBoard(int value, int position) {
        char validInput = validator(converter(value));
        char [] gameBoard = new char[9];
        gameBoard[position -1] = validInput;

        return gameBoard;
    }




    private char validator(String input) {
        char validInput = 0;
        if (input.equals("X")) {
            validInput = 'X';
        }
        if (input.equals("O")) {
            validInput = 'O';
        }
        return validInput;
    }
}
