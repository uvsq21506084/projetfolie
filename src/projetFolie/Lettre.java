package projetFolie;

public class Lettre {
	char l;

	public Lettre(char c) {
		l = c;
	}

	static public void afficheLettre(char l) {
		switch (l) {
		case 'A':
			System.out.println("Abeille sans reine, ruche perdue.");
			break;
		case 'B':
			System.out.println("Bateau arrêté ne gagne rien.");
			break;
		case 'C':
			System.out.println("Cela paraît comme le nez au milieu de la figure.");
			break;
		case 'D':
			System.out.println("Dans la ville : mon nom ; hors de la ville : mon habit.");
			break;
		case 'E':
			System.out.println("Ecoute ce qui est bien dit, même venant d'un ennemi.");
			break;
		case 'F':
			System.out.println("Fais aujourd'hui ce qui peut être fait demain.");
			break;
		case 'G':
			System.out.println("Gagne assez qui sort de procès.");
			break;
		case 'H':
			System.out.println("Hasard qui tocque, femme qui pêle n'est pas morte.");
			break;
		case 'I':
			System.out.println("Il a le mal saint Genou.");
			break;
		case 'J':
			System.out.println("Jamais à bon chien il ne vient bon os.");
			break;
		case 'K':
			System.out.println("Kaka");
			break;
		case 'L':
			System.out.println("La bonne renommée reste couchée, la mauvaise court les chemins.");
			break;
		case 'M':
			System.out.println("Main serrée, cœur étroit.");
			break;
		case 'N':
			System.out.println("N'achète pas la maison avant d'avoir acheté le voisin.");
			break;
		case 'O':
			System.out.println("Octobre est bon s'il est de saison.");
			break;
		case 'P':
			System.out.println("Pain dérobé réveille l'appétit.");
			break;
		case 'Q':
			System.out.println("Quand décroîtra la lune, ne sème chose aucune.");
			break;
		case 'R':
			System.out.println("Réduis tes désirs et tu augmentera ta santé.");
			break;
		case 'S':
			System.out.println("Sagesse ne s'apprend pas dans les livres toujours ; malice s'apprend tous les jours.");
			break;
		case 'T':
			System.out.println("Tant de gens, tant de guise.");
			break;
		case 'U':
			System.out.println("Un ami c'est une route, un ennemi c'est un mur.");
			break;
		case 'V':
			System.out.println("Va lentement, tu iras plus loin.");
			break;
		case 'W':
			System.out.println("What the fuck ! ");
			break;
		case 'X':
			System.out.println("Xavier ! t'es pas xavier par hasard");
			break;
		case 'Y':
			System.out.println("Y penser sans cesse ne labourera pas le champ.");
			break;
		case 'Z':
			System.out.println("Zut ! le week-end passe vite");
			break;
		}
	}

	static public char conversionLettreToMajuscule(char c) {
   	char result;  
	if (( c <= 'z' ) && ( c >='a')){
         result = (char) ((int)c + (int)'Z' - (int)'z');
     } else if (( c <= 'Z' )&& ( c >= 'A')){
         result = c;
     } else {
         result = ' ';
     }
		return result;
	}
}
