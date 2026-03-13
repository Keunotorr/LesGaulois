package personnages;

public class Chaudron {
	private int quantitePotion = 0;
	private int forcePotion = 0;
	
	public Chaudron() {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int force) {
		quantitePotion = quantite;
		forcePotion = force;
	}
	
	public boolean resterPotion() {
		return quantitePotion == 0;
	}
	

}
