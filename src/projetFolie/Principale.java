package projetFolie;

public class Principale {

	public static void main(String[] args) {
		//Age a = new Age(80);
		//TestCouleur c = new TestCouleur(Couleur.ORANGE);
		//a.afficheAge();
		//c.afficheCouleur();
		String foo = "Helloworld";
		char[] charArray = foo.toCharArray();
		for(char c: charArray) {
			if(Lettre.conversionLettreToMajuscule(c)==' ')
				System.out.println("caractère invalide !!");
				else 
				//System.out.println(Lettre.conversionLettreToMajuscule(c));
				Lettre.afficheLettre(c);
		}
		
		

		
		

	}

}
