package projetFolie;

import java.util.Scanner;

public class CommunicationConsole {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Bonjour dans notre programme de folie haha !! ");
		System.out.println("votre age est ? :");
		int age = scanner.nextInt();
		Age a = new Age(age); 
		a.afficheAge();
		System.out.println("choisit une couleur préférée parmi ces couleurs	ROUGE,BLANC,NOIR,JAUNE,VERT,BLEU,VIOLET,ROSE,ORANGE");
		String couleur = scanner.next();
		TestCouleur c = new TestCouleur(couleur);
		c.afficheCouleur();
		
	}
}
