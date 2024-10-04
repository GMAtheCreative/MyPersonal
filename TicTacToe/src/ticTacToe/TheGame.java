package ticTacToe;

import java.util.Scanner;

public class TheGame {
    public static void main(String[] args) {
        String prompt = input("shall we play (yes to start): ");
        while (prompt.equals("yes")) {
            char 
        }
    }
    private static void print(String theMessage){
        System.out.println(theMessage);
    }
    private static String input (String theMessage){
        print(theMessage);
        return new Scanner(System.in).nextLine();
    }
}
