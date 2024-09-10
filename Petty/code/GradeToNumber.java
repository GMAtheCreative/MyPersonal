import java.util.Scanner;
public class GradeToNumber{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a letter grade (in upper case): ");
	char grade = input.next().charAt(0);

	if (grade == 'A'){
		System.out.println("4");
		}
	else if (grade == 'B'){
		System.out.println("3");
		}
	else if (grade == 'C'){
		System.out.println("2");
		}
	else if (grade == 'D'){
		System.out.println("1");
		}	
	else if (grade == 'F'){
		System.out.print("0");
		}
	else{
		System.out.println("invalid grade");
		}
	}

}