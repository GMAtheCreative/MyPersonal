import java.util.Scanner;
public class KeyPad{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a letter: ");
	char letter = input.next().charAt(0);
	
	if (letter == 'A' || letter == 'a' || letter == 'B' || letter == 'b' || letter == 'C' || letter == 'c'){
		System.out.print("2");
		}
	else if (letter == 'D' || letter == 'E' || letter == 'F' || letter == 'd' || letter == 'e' || letter == 'f'){
		System.out.print("3");
		}
	else if (letter == 'G' || letter == 'H' || letter == 'I' || letter == 'g' || letter == 'h' || letter == 'i'){
		System.out.print("4");
		}
	else if (letter == 'J' || letter == 'K' || letter == 'L' || letter == 'j' || letter == 'k' || letter == 'l'){
		System.out.print("5");
		}
	else if (letter == 'M' || letter == 'N' || letter == 'O' || letter == 'm' || letter == 'n' || letter == 'o'){
		System.out.print("6");
		}
	else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S' || letter == 'p' || letter == 'q' || letter == 'r' || letter == 's'){
		System.out.print("7");
		}
	else if (letter == 'T' || letter == 'U' || letter == 'V' || letter == 't' || letter == 'u' || letter == 'v'){
		System.out.print("8");
		}
	else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z' || letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z'){
		System.out.print("9");
		}
	else{
		System.out.print("invalid input");
		}

	}
}