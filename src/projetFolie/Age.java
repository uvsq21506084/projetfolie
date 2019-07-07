package projetFolie;

public class Age {
	private int age;

	public Age(int age) {
		this.age = age;
	}
	public void afficheAge() {
		if (this.age < 0) {
			System.out.println("C'est pas normal !!!!");
			System.out.println("t'es pas encore arrivé à la vie !!");
			System.out.println("mon conseil pour toi !!");
			System.out.println("C'est po la peine d'y venir");
		}
		if (this.age >= 0 && this.age < 10) {
			System.out.println("t'es un petit gamin !!");
			System.out.println("tu iras à l'école !");
			System.out.println("mais j'ai oublié ce sont les vacances");
			System.out.println("vas jouer avec lili au parc !");
		}
		if (this.age >= 10 && this.age <= 20) {
			System.out.println("T'es un grand !");
			System.out.println("la vie n'est pas belle ?! ");
			System.out.println("pendant les vacances on s'amuse bien !!");
		}
		if(this.age >= 20 && this.age <60)
		{
			System.out.println("le boulot est chiant ");
			System.out.println("je dois payer le loyer ");
			System.out.println("merde ! la responsablité est très lourd");
			System.out.println("quand j'aurai ma retraite pour se reposer ! ");
		}
		if(this.age > 60)
		{
			System.out.println("Ah la retraite ! ");
			System.out.println("tu vas mourir quand ?");
			System.out.println("non sérieusement tu vas mourir quand !");
			System.out.println("de toute façon je vais aller sortir à 11h00 pour que j'arrive en arrêt de bus vers 15h00 !");
		}
	}

}
