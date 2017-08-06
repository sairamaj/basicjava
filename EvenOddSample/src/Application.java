import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("give number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		// number % 2 is zero it is even
		// else it is odd
		
		if(number %2 == 0) {
			System.out.println(number + " is even");
		}else {
			System.out.println(number + " is odd");
		}

	}

}
