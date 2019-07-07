package projetFolie;

public class Lettre {
	char l;

	public Lettre(char c) {
		l = c;
	}

	static public String afficheLettre(char l) {
		String s;
		switch (l) {
		case 'A':
			s="Abeille sans reine, ruche perdue.";
			break;
		case 'B':
			s="Bateau arrêté ne gagne rien.";
			break;
		case 'C':
			s="Cela paraît comme le nez au milieu de la figure.";
			break;
		case 'D':
			s="Dans la ville : mon nom ; hors de la ville : mon habit.";
			break;
		case 'E':
			s="Ecoute ce qui est bien dit, même venant d'un ennemi.";
			break;
		case 'F':
			s="Fais aujourd'hui ce qui peut être fait demain.";
			break;
		case 'G':
			s="Gagne assez qui sort de procès.";
			break;
		case 'H':
			s="Hasard qui tocque, femme qui pêle n'est pas morte.";
			break;
		case 'I':
			s="Il a le mal saint Genou.";
			break;
		case 'J':
			s="Jamais à bon chien il ne vient bon os.";
			break;
		case 'K':
			s="Kaka";
			break;
		case 'L':
			s="La bonne renommée reste couchée, la mauvaise court les chemins.";
			break;
		case 'M':
			s="Main serrée, cœur étroit.";
			break;
		case 'N':
			s="N'achète pas la maison avant d'avoir acheté le voisin.";
			break;
		case 'O':
			s="Octobre est bon s'il est de saison.";
			break;
		case 'P':
			s="Pain dérobé réveille l'appétit.";
			break;
		case 'Q':
			s="Quand décroîtra la lune, ne sème chose aucune.";
			break;
		case 'R':
			s="Réduis tes désirs et tu augmentera ta santé.";
			break;
		case 'S':
			s="Sagesse ne s'apprend pas dans les livres toujours ; malice s'apprend tous les jours.";
			break;
		case 'T':
			s="Tant de gens, tant de guise.";
			break;
		case 'U':
			s="Un ami c'est une route, un ennemi c'est un mur.";
			break;
		case 'V':
			s="Va lentement, tu iras plus loin.";
			break;
		case 'W':
			s="What the fuck ! ";
			break;
		case 'X':
			s="Xavier ! t'es pas xavier par hasard";
			break;
		case 'Y':
			s="Y penser sans cesse ne labourera pas le champ.";
			break;
		case 'Z':
			s="Zut ! le week-end passe vite";
			break;
		default : 
			s = "cette lettre est invalide ne déconnez pas !";		
		}
		return s;
		
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
