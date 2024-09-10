import java.util.Scanner;
public class Countries{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the first country: ");
	String country1 = input.nextLine();

	System.out.println("Enter the second country: ");
	String country2 = input.nextLine();

	System.out.println("Enter third country: ");
	String country3 = input.nextLine();

	if (country1.charAt(0) > country2.charAt(0) && country3.charAt(0)){
		System.out.println(country1%ncountry2%country3);
		}
	}
}