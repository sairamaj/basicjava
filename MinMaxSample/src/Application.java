import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("Give first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		System.out.print("Give second number:");
		int secondNumber = scanner.nextInt();
		
		//  10, 20  (min:10 max:20 )
		//  30, 15  ( min:15: max:30)
		
		if( firstNumber < secondNumber) {
			System.out.println("min is:" + firstNumber);
		}else {
			
		}
	}

}
