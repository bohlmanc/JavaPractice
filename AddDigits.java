import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter an integer 0-1000: ");
		int num = scan.nextInt();

		int sum = 0;
		while(num > 0) {
			sum = sum + (num % 10);
			num /= 10;
		}

		System.out.println("The sum of the digits is "+sum);

	}

}