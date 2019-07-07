package projetFolie;

public class TestCouleur {
	String c; 
	public TestCouleur(String c){
		this.c=c; 
	}
public void afficheCouleur(){
	System.out.println("la couleur que t'as choisi signifie :");
	switch(c){
	case "NOIR" : 
		System.out.println("�l�gance, simplicit�, sobri�t�, rigueur, myst�re");
		System.out.println("mais aussi mort, deuil, tristesse, vide, obscurit�");
		System.out.println("cette couleur pr�sente  t�n�bres (nuit), certains animaux (merle, corbeau, chats)");
		break;
	case "ROUGE" : 
		System.out.println("amour, passion, chaleur, sexualit�, ardeur, triomphe");
		System.out.println("mais aussi  col�re, interdiction, danger");
		System.out.println("cette couleur pr�sente sang, feu, lave, v�g�taux (tomate, coquelicot, fraise) ");
		break;
	case "BLANC" : 
		System.out.println("puret�, innocence");
		System.out.println("mais aussi fant�me ");
		System.out.println("cette couleur pr�sente neige, lumi�re, lait, robe de mari� ");
		break;
	case "JAUNE": 
		System.out.println("f�te, joie, chaleur, ego, puissance, connaissance, amiti�");
		System.out.println("mais aussi  tra�trise, mensonge, tromperie");
		System.out.println("cette couleur pr�sente bo�tes aux lettres, sable, soleil, �uf, fleurs (marguerite)");
		break;
	case "BLEU": 
		System.out.println("r�ve, sagesse, s�r�nit�, v�rit�, loyaut�, fra�cheur");
		System.out.println("mais aussi m�lancolie");
		System.out.println("cette couleur pr�sente oc�an, ciel, fleurs (bleuet) ");
		break;
	case "VIOLET": 
		System.out.println("r�ve, d�licatesse, paix, amiti�, m�ditation");
		System.out.println("mais aussi m�lancolie, solitude");
		System.out.println("cette couleur pr�sente v�g�taux (raisin, aubergine), fleurs (violette), habits des �v�ques");
		break;
	case "ROSE": 
		System.out.println("f�minit�, romantisme, s�duction, bonheur, tendresse, jeunesse");
		System.out.println("mais aussi couleur r�serv�e aux filles");
		System.out.println("cette couleur pr�sente fleurs (roses)");
		break;
	case "VERT": 
		System.out.println("esp�rance, chance, stabilit�, concentration");
		System.out.println("mais aussi �chec, infortune");
		System.out.println("cette couleur pr�sente v�g�taux, l�gumes (poivrons, petits pois)");
		break;
	case "ORANGE": 
		System.out.println("joie, cr�ativit�, communication, s�curit�, optimisme");
		System.out.println("mais aussi kitch");
		System.out.println("cette couleur pr�sente fruits (orange, abricot, melon)");
		break;
	default : 
		System.out.println("que t'es extraordinaire !");
		System.out.println("je te conseille de choisir la prochaine fois une couleur que je t'ai pr�cis�");
		System.out.println("mais je t'ai dit de choisir parmi ces couleurs et en majiscule");
	}
}
}
