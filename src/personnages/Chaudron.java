package personnages;

public class Chaudron {
	public int quantitePotion = 0;
	public int forcePotion = 0;
	
	public Chaudron() {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int force) {
		quantitePotion = quantite;
		forcePotion = force;
	}
	
	public boolean resterPotion() {
		return (quantitePotion != 0);
	}
	

}
