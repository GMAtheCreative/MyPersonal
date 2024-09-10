import java.util.Scanner;
public class GradesToNumbers{
	public static void main(String [] args){


	Scanner input = new Scanner(System.in);

	System.out.println("Enter grade in letters: ");
	char grade = input.next().charAt(0);

	if (grade == 'A' || grade == 'a'){
		System.out.println("4");
		}
	else if (grade == 'b' || grade ==  'B'){
		System.out.println("3");
		}
	else if (grade == 'c' || grade == 'C'){
		System.out.println("2");
		}
	else if(grade == 'D' || grade == 'd'){
		System.out.println("1");
		}
	else if (grade == 'f' || grade == 'F'){
		System.out.println("0");
		}
	else {
		System.out.println(" Invalid grade");
		}
	}

}