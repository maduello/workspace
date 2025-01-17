import java.util.Scanner;

public class JeuPlusOuMoins {
	
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nombreSecret = 0, nombreUser = 0;
		String userName = "Maduel SOFT";
		
		
		nombreSecret = (int) ((Math.random() * 999) + 1);
		
		do {
			System.out.print("Entrez un nombre (1 - 1000): ");
			nombreUser = clavier.nextInt();
			
			if ( nombreUser == nombreSecret) {
				System.out.println(userName + " Félicitations !!!");
			} else if ( nombreUser < nombreSecret) {
				System.out.println("Votre nombre est trop petit");
			} else {
				System.out.println("Votre nombre est trop grand");
			}
			
		} while( nombreUser != nombreSecret );

	}

}

