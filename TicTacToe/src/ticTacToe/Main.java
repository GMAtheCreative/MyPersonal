package ticTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lets play Y/N: ");
        String answer = input.next();
        while(answer.equalsIgnoreCase("Y")){

    }
}
private void boardTable (){
    int[]playerBoard = new int[9];
    System.out.println("-+-+-");
    System.out.println(playerBoard[0],|,playerBoard[1],|,playerBoard[2]);
    System.out.println("-+-+-");
    System.out.println(playerBoard[3],playerBoard[4],playerBoard[5]);
    System.out.println("-+-+-");
    System.out.println(playerBoard[6],playerBoard[7],playerBoard[8]);
    System.out.println("-+-+-");
}
