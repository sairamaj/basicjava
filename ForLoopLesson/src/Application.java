
public class Application {
	public static void main(String[] args) {
		int age = 16;

		if (age < 12) {
			System.out.println("you are kid");
		} else if (age >=13 && age <=19) {
			System.out.println("you are teen");
		} else if( age < 60){
			System.out.println("you are adult");
		} else {
			System.out.println("Senior citizen.");
		}
	}
}
