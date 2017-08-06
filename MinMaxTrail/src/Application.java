import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("first number:");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();

		scanner = new Scanner(System.in);
		System.out.print("second number:");
		int num2 = scanner.nextInt();

		System.out.println(num1);
		System.out.println(num2);
		
		int max, min;
		if( num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		System.out.println("min:" + min);
		System.out.println("max:" + max);
		
	}

}
