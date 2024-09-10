import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        System.out.print("Enter an encrypted four-digit integer: ");
        int num = collect.nextInt();
        

        int digit1 = (num / 1000 + 3) % 10;
        int digit2 = ((num / 100) % 10 + 3) % 10;
        int digit3 = ((num / 10) % 10 + 3) % 10;
        int digit4 = (num % 10 + 3) % 10;

	int[] sort = {digit3, digit4, digit1, digit2};

        String newNumberStg = "";
	for(int count = 0; count < sort.length; count++) {
		newNumberStg = newNumberStg + sort[count];
	}
	
	

	//return newNumberStg;

        System.out.println(newNumberStg);
    }
}
