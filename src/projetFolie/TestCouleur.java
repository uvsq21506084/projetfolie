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
		System.out.println("élégance, simplicité, sobriété, rigueur, mystère");
		System.out.println("mais aussi mort, deuil, tristesse, vide, obscurité");
		System.out.println("cette couleur présente  ténèbres (nuit), certains animaux (merle, corbeau, chats)");
		break;
	case "ROUGE" : 
		System.out.println("amour, passion, chaleur, sexualité, ardeur, triomphe");
		System.out.println("mais aussi  colère, interdiction, danger");
		System.out.println("cette couleur présente sang, feu, lave, végétaux (tomate, coquelicot, fraise) ");
		break;
	case "BLANC" : 
		System.out.println("pureté, innocence");
		System.out.println("mais aussi fantôme ");
		System.out.println("cette couleur présente neige, lumière, lait, robe de marié ");
		break;
	case "JAUNE": 
		System.out.println("fête, joie, chaleur, ego, puissance, connaissance, amitié");
		System.out.println("mais aussi  traîtrise, mensonge, tromperie");
		System.out.println("cette couleur présente boîtes aux lettres, sable, soleil, œuf, fleurs (marguerite)");
		break;
	case "BLEU": 
		System.out.println("rêve, sagesse, sérénité, vérité, loyauté, fraîcheur");
		System.out.println("mais aussi mélancolie");
		System.out.println("cette couleur présente océan, ciel, fleurs (bleuet) ");
		break;
	case "VIOLET": 
		System.out.println("rêve, délicatesse, paix, amitié, méditation");
		System.out.println("mais aussi mélancolie, solitude");
		System.out.println("cette couleur présente végétaux (raisin, aubergine), fleurs (violette), habits des évêques");
		break;
	case "ROSE": 
		System.out.println("féminité, romantisme, séduction, bonheur, tendresse, jeunesse");
		System.out.println("mais aussi couleur réservée aux filles");
		System.out.println("cette couleur présente fleurs (roses)");
		break;
	case "VERT": 
		System.out.println("espérance, chance, stabilité, concentration");
		System.out.println("mais aussi échec, infortune");
		System.out.println("cette couleur présente végétaux, légumes (poivrons, petits pois)");
		break;
	case "ORANGE": 
		System.out.println("joie, créativité, communication, sécurité, optimisme");
		System.out.println("mais aussi kitch");
		System.out.println("cette couleur présente fruits (orange, abricot, melon)");
		break;
	default : 
		System.out.println("que t'es extraordinaire !");
		System.out.println("je te conseille de choisir la prochaine fois une couleur que je t'ai précisé");
		System.out.println("mais je t'ai dit de choisir parmi ces couleurs et en majiscule");
	}
}
}
