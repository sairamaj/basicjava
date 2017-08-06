import java.util.*;
public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("table number:");
		int number = scanner.nextInt();
		for(int i=1; i<=10; i++) {
			int answer = number * i;
			System.out.println(number + " *" + " " + i + " = " + " " + answer);
		}
	}
}
