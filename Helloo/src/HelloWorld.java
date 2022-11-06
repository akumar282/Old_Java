import java.util.Scanner;

public class HelloWorld { 
	
	public static void main(String[] args) {
		System.out.println("What is you number?");
		Scanner in = new Scanner(System.in);
		int name = in.nextInt();
		System.out.println("Your name is: "+ name);
	}
	
	
}
