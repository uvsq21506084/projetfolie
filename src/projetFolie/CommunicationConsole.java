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
		System.out.println("Entrer votre nom majuscule ou miniscule mais ne contient pas des caractères !!");
		String name = scanner.next();
		char[] charArray = name.toCharArray();
		for(char e: charArray) {
			if(Lettre.conversionLettreToMajuscule(e)==' ')
				System.out.println("caractère invalide !!");
				else 
				//System.out.println(Lettre.conversionLettreToMajuscule(c));
				System.out.println(e+" : "+Lettre.afficheLettre(Lettre.conversionLettreToMajuscule(e)));
		}
		
		
	}
}
