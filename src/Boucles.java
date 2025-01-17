import java.util.Scanner;

public class Boucles {
	
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			
			System.out.println("Le double de " + i + " est " + 2*i);
		}
		
		int age = 0;
		
		do {
			System.out.print("\nEntrez votre age: ");
			age = clavier.nextInt();
			
			if(age <= 5) {
				System.out.println("\nL'age doit être supérieur à 5 ");
			}
		} while (age <= 5);
		
		System.out.println("\nSuite du programme...");

	}

}
