import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		boolean quit = false;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter command:");
			String command = scanner.nextLine();
			if( command.equals("quit")) {
				quit = true;
			}else {
				System.out.println("you have entered:" + command);
			}
		}while(quit == false);
		
		System.out.println("done");
	}
	
	
}
