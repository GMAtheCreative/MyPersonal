import java.util.Scanner;
public class Perimeter{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);

	double pie = 3.14159;

	System.out.println("Enter value for radius: ");
	double radius = input.nextDouble();

	double area = radius * radius *pie;
	double perimeter = 2 * radius * pie;

	System.out.printf("The value of area is %f, the value of perimeter is %f", area, perimeter);
	}
}