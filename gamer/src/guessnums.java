import java.util.Scanner;
import java.util.Random;

public class guessnums {

	public static void main(String[] args) {
		epicgame();

	}
	public static void epicgame() {
		System.out.println("Enter limit for number: ");
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int num = generator.nextInt(input.nextInt());
		int guess = -1;
		System.out.println("Go ahead.....guess");
		guess  = input.nextInt();
		while (num != guess) {
			if(num > guess) {
				System.out.println("The guess is low as your grades");
			}
			if(num < guess) {
				System.out.println("Your guess is high as snoop dogg");
			}
			System.out.println();
			System.out.println("Go ahead.....guess");
			guess = input.nextInt();
		} 
		System.out.println("Damn.....you got it");
	}

}
