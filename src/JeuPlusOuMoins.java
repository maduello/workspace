import java.util.Scanner;

public class JeuPlusOuMoins {
	
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nombreSecret = 0, nombreUser = 0;
		int nombreEssaie = 5;
		int essaie = 0;
		String userName = "Maduel SOFT";
		
		
		nombreSecret = (int) ((Math.random() * 999) + 1);
		System.out.println(nombreSecret);
		
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
			essaie++;
			if ( essaie == nombreEssaie)
			{
				System.out.println("Tu as perdu car nombre d'essaies atteint. ");
				break;
			}
			
		} while( nombreUser != nombreSecret );

	}

}

