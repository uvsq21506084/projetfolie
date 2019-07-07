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
			s="Bateau arr�t� ne gagne rien.";
			break;
		case 'C':
			s="Cela para�t comme le nez au milieu de la figure.";
			break;
		case 'D':
			s="Dans la ville : mon nom ; hors de la ville : mon habit.";
			break;
		case 'E':
			s="Ecoute ce qui est bien dit, m�me venant d'un ennemi.";
			break;
		case 'F':
			s="Fais aujourd'hui ce qui peut �tre fait demain.";
			break;
		case 'G':
			s="Gagne assez qui sort de proc�s.";
			break;
		case 'H':
			s="Hasard qui tocque, femme qui p�le n'est pas morte.";
			break;
		case 'I':
			s="Il a le mal saint Genou.";
			break;
		case 'J':
			s="Jamais � bon chien il ne vient bon os.";
			break;
		case 'K':
			s="Kaka";
			break;
		case 'L':
			s="La bonne renomm�e reste couch�e, la mauvaise court les chemins.";
			break;
		case 'M':
			s="Main serr�e, c�ur �troit.";
			break;
		case 'N':
			s="N'ach�te pas la maison avant d'avoir achet� le voisin.";
			break;
		case 'O':
			s="Octobre est bon s'il est de saison.";
			break;
		case 'P':
			s="Pain d�rob� r�veille l'app�tit.";
			break;
		case 'Q':
			s="Quand d�cro�tra la lune, ne s�me chose aucune.";
			break;
		case 'R':
			s="R�duis tes d�sirs et tu augmentera ta sant�.";
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
			s = "cette lettre est invalide ne d�connez pas !";		
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
