import java.util.Scanner;

public class Lecture {
	
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		double n = 0;
		String pseudo = "";
		
		System.out.print("Entrez un nombre: ");
		n = clavier.nextDouble();
		
		System.out.print("Le carré de " + pseudo + " est " + (n*n));

	}
}
