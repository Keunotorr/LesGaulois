package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concocter" + quantite + "doses de potion magique. Elle a une force de" + forcePotion + ".");
		
	}
	
	public void bousterGaulois(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if (gaulois.getNom() == "Obélix") {
				this.parler("Non," + gaulois.getNom() + "Non !... Et tu le sais très bien !") ;
			}
			else {
				prendreLouche(); // TODO
				gaulois.boirePotion(); // TODO
			}
	}
	
}}
