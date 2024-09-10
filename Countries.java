import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first country: ");
        String country1 = input.nextLine();

        System.out.println("Enter the second country: ");
        String country2 = input.nextLine();

        System.out.println("Enter third country: ");
        String country3 = input.nextLine();

        
        if (country1.compareTo(country2) >= 0 && country1.compareTo(country3) >= 0) {
            System.out.printf("%s, %s, %s", country1, country2, country3);
            } 
	    else if (country2.compareTo(country1) >= 0 && country2.compareTo(country3) >= 0) {
            System.out.printf("%s, %s, %s", country2, country1, country3);
            } 
	    else {
            System.out.printf("%s, %s, %s", country3, country1, country2);
        }
    }
}
