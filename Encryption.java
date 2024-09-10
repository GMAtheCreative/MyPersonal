import java.util.Scanner;

public class Encryption {
    public static void main(String... args) {
        Scanner collect = new Scanner(System.in);
        System.out.println("Enter a four-digit integer: ");
        int num = collect.nextInt();
        

        int digit1 = (num / 1000 + 7) % 10;
        int digit2 = ((num / 100) % 10 + 7) % 10;
        int digit3 = ((num / 10) % 10 + 7) % 10;
        int digit4 = (num % 10 + 7) % 10;

	int[] sort = {digit3, digit4, digit1, digit2};

        String newNumberStg = "";
	for(int count = 0; count < sort.length; count++) {
		newNumberStg = newNumberStg + sort[count];
	}
	
	

	//return newNumberStg;

        System.out.println(newNumberStg);
    }
}
